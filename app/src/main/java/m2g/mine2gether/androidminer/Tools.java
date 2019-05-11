/*
 *  File Tools for Monero Miner
 *  (c) 2018 Uwe Post
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program. If not, see <http://www.gnu.org/licenses/>.
 * /
 */
// Copyright (c) 2019, Mine2Gether.com
//
// Please see the included LICENSE file for more information.

package m2g.mine2gether.androidminer;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Tools {

    private static final String LOG_TAG = "MiningSvc";

    public static String loadConfigTemplate(Context context) {
        try {
            StringBuilder buf = new StringBuilder();
            InputStream json = context.getAssets().open("config.json");
            BufferedReader in = new BufferedReader(new InputStreamReader(json, "UTF-8"));
            String str;

            while ((str = in.readLine()) != null) {
                buf.append(str);
            }

            in.close();
            return buf.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void copyFile(Context context, String assetFilePath, String localFilePath) {
        try {
            InputStream in = context.getAssets().open(assetFilePath);
            FileOutputStream out = new FileOutputStream(localFilePath);
            int read;
            byte[] buffer = new byte[4096];
            while ((read = in.read(buffer)) > 0) {
                out.write(buffer, 0, read);
            }
            out.close();
            in.close();

            File bin = new File(localFilePath);
            bin.setExecutable(true);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void copyDirectoryContents(Context context, String assetFilePath, String localFilePath) {

        String[] folder;
        try {
            folder = context.getAssets().list(assetFilePath);
        } catch (Exception e) {
            return;
        }

        for (final String f : folder) {

            Log.i(LOG_TAG, "copy file: source:" + assetFilePath + "/" + f + " dest:" + localFilePath + "/" + f);
            copyFile(context, assetFilePath + "/" + f, localFilePath + "/" + f);
        }
    }

    public static void logDirectoryFiles(final File folder) {
        for (final File f : folder.listFiles()) {

            if (f.isDirectory()) {
                logDirectoryFiles(f);
            }

            if (f.isFile()) {
                Log.i(LOG_TAG, f.getName());
            }

        }
    }

    public static void deleteDirectoryContents(final File folder) {
        for (final File f : folder.listFiles()) {

            if (f.isDirectory()) {
                deleteDirectoryContents(f);
            }

            if (f.isFile()) {
                Log.i(LOG_TAG, "Delete: " + f.getName());
                f.delete();
            }

        }
    }

    public static void writeConfig(String configTemplate, String algo, String poolUrl, String username, String pass, int threads, int maxCpu, int av, String privatePath) {

        String config = configTemplate
                .replace("$algo$", algo)
                .replace("$url$", poolUrl)
                .replace("$username$", username)
                .replace("$pass$", pass)
                .replace("$threads$", Integer.toString(threads))
                .replace("$maxcpu$", Integer.toString(maxCpu))
                .replace("$av$", Integer.toString(av));

        Log.i(LOG_TAG, "CONFIG: " + config);

        PrintWriter writer = null;

        try {
            writer = new PrintWriter(new FileOutputStream(privatePath + "/config.json"));
            writer.write(config);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (writer != null) writer.close();
        }
    }

    public static Map<String, String> getCPUInfo() {

        Map<String, String> output = new HashMap<>();

        try {
            BufferedReader br = null;
            br = new BufferedReader(new FileReader("/proc/cpuinfo"));

            String str;

            while ((str = br.readLine()) != null) {

                String[] data = str.split(":");

                if (data.length > 1) {

                    String key = data[0].trim().replace(" ", "_");
                    if (key.equals("model_name")) key = "cpu_model";

                    String value = data[1].trim();

                    if (key.equals("cpu_model"))
                        value = value.replaceAll("\\s+", " ");

                    output.put(key, value);

                }

            }

            br.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return output;
    }
}
