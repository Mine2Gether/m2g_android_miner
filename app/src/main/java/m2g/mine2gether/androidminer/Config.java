// Copyright (c) 2019, Mine2Gether.com
//
// Please see the included LICENSE file for more information.

package m2g.mine2gether.androidminer;

import java.util.ArrayList;

public class Config {

    public static Config settings = new Config();

    private ArrayList<PoolItem> mPools = new ArrayList<PoolItem>();
    private ArrayList<AlgoItem> mAlgos = new ArrayList<AlgoItem>();

    public static int defaultPoolIndex = 1;
    public static String defaultWallet = "";
    public static String defaultPassword = "";

    public Config() {

        mAlgos.add(new AlgoItem("argon2/chukwa", "NinjaRig",  new ArrayList<MinerItem>(){
            {
                add(new MinerItem("NinjaRig", "argon2/chukwa","ninjarig"));
                add(new MinerItem("violetminer", "chukwa","violetminer"));
                add(new MinerItem("XMRig", "argon2/chukwa","xmrig"));

            }
        }));

        mAlgos.add(new AlgoItem("argon2/wrkz", "NinjaRig", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("NinjaRig", "chukwa/wrkz","ninjarig"));
                add(new MinerItem("violetminer", "chukwa_wrkz","violetminer"));
                add(new MinerItem("XMRig", "argon2/wrkz","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("rx/test", "XMRig", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "rx/test","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("rx/0", "XMRig", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "rx/0","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("rx/wow", "XMRig", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "rx/wow","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("rx/loki", "XMRig", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "rx/loki","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cn/fast", "XMRig", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "cn/fast","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cn/rwz", "XMRig", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "cn/rwz","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cn/zls", "XMRig", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "cn/zls","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cn/double","XMRig",  new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "cn/double","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cn/r", "XMRig", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "cn/r","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cn/wow", "XMRig", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "cn/wow","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cn/gpu","XMRig",  new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "cn/gpu","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cn-pico/trtl","XMRig",  new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "rx/test","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cn/half", "XMRig", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "cn/half","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cn/2", "XMRig", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "cn/2","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cn/xao", "XMRig", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "cn/xao","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cn/rto","XMRig",  new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "cn/rto","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cn-heavy/tube", "XMRig", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "cn-heavy/tube","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cn-heavy/xhv", "XMRig", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "cn-heavy/xhv","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cn-heavy/0", "XMRig", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "cn-heavy/0","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cn/1", "XMRig", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "cn/1","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cn-lite/1", "XMRig", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "cn-lite/1","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cn-lite/0","XMRig",  new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "cn-lite/0","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cn/0", "XMRig", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig", "cn/0","xmrig"));
            }
        }));

        mAlgos.add(new AlgoItem("cryptonight-upx/2", "XMRig-UPX", new ArrayList<MinerItem>(){
            {
                add(new MinerItem("XMRig-UPX", "cryptonight-upx/2","xmrig-upx"));
            }
        }));

        //User Defined
        mPools.add(new PoolItem("custom", "custom", "", "", "", "", "", "", ""));

        // Turtlecoin (TRTL)|trtl.pool.mine2gether.com:2225|argon2/chukwa
        mPools.add(new PoolItem(
                        "trtl",
                        "Turtlecoin (TRTL)",
                        "trtl.pool.mine2gether.com:2225",
                        "argon2/chukwa",
                        "https://trtl.mine2gether.com/api",
                        "https://trtl.mine2gether.com",
                        "https://trtl.mine2gether.com/#my_stats",
                        "https://trtl.mine2gether.com/#getting_started",
                        ""
                )
        );

        // Loki Network (LOKI)|cn-pico/trtl
        mPools.add(new PoolItem(
                        "loki",
                        "Loki Network (LOKI)",
                        "loki.pool.mine2gether.com:2221",
                        "cn-pico/trtl",
                        "https://loki.mine2gether.com/api",
                        "https://loki.mine2gether.com",
                        "https://loki.mine2gether.com/#my_stats",
                        "https://loki.mine2gether.com/#getting_started",
                        ""
                )
        );

        // ARQMA (ARQ)|cn-pico/trtl
        mPools.add(new PoolItem(
                        "arqma",
                        "ARQMA (ARQ)",
                        "arq.pool.mine2gether.com:2226",
                        "cn-pico/trtl",
                        "https://arq.mine2gether.com/api",
                        "https://arq.mine2gether.com",
                        "https://arq.mine2gether.com/#my_stats",
                        "https://arq.mine2gether.com/#getting_started",
                        ""
                )
        );

        // XtendCash (XTNC)|cn-pico/trtl
        mPools.add(new PoolItem(
                        "xtnc",
                        "XtendCash (XTNC)",
                        "xtnc.pool.mine2gether.com:2222",
                        "cn-pico/trtl",
                        "https://xtnc.mine2gether.com/api",
                        "https://xtnc.mine2gether.com",
                        "https://xtnc.mine2gether.com/#my_stats",
                        "https://xtnc.mine2gether.com/#getting_started",
                        ""
                )
        );

        // Wownero (WOW)|cn-pico/trtl
        mPools.add(new PoolItem(
                        "wow",
                        "Wownero (WOW)",
                        "wow.pool.mine2gether.com:2228",
                        "rx/wow",
                        "https://wow.mine2gether.com/api",
                        "https://wow.mine2gether.com",
                        "https://wow.mine2gether.com/#my_stats",
                        "https://wow.mine2gether.com/#getting_started",
                        ""
                )
        );

        // uPlexa (UPX)|upx.pool.mine2gether.com:2223|cryptonight-upx/2
        mPools.add(new PoolItem(
                        "upx",
                        "uPlexa (UPX)",
                        "upx.pool.mine2gether.com:2223",
                        "cryptonight-upx/2",
                        "https://upx.mine2gether.com/api",
                        "https://upx.mine2gether.com",
                        "https://upx.mine2gether.com/#my_stats",
                        "https://upx.mine2gether.com/#getting_started",
                        ""
                )
        );


        // Alloy (XAO)|xao.pool.mine2gether.com:1117|cn/xao
        mPools.add(new PoolItem(
                        "xao",
                        "Alloy (XAO)",
                        "xao.pool.mine2gether.com:1117",
                        "cn/xao",
                        "https://xao.mine2gether.com/api",
                        "https://xao.mine2gether.com",
                        "https://xao.mine2gether.com/#my_stats",
                        "https://xao.mine2gether.com/#getting_started",
                        ""
                )
        );

        /*
        mPools.add(new PoolItem(
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                )
        );
        */
    }

    public PoolItem[] getPools() {
        return this.mPools.toArray(new PoolItem[mPools.size()]);
    }

    public AlgoItem[] getAlgos() {
        return this.mAlgos.toArray(new AlgoItem[mAlgos.size()]);
    }

}
