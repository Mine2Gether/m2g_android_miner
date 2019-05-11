// Copyright (c) 2019, Mine2Gether.com
//
// Please see the included LICENSE file for more information.

package m2g.mine2gether.androidminer;

public class PreferenceHelper {

    public static void setName(String key, String value) {
        MainActivity.preferences.edit().putString(key, value).commit();
    }

    public static String getName(String key) {
        return MainActivity.preferences.getString(key, "");
    }

    public static void clear() {
        MainActivity.preferences.edit().clear().commit();
    }

}