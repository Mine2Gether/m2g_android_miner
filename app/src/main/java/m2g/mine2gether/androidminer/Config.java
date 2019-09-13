// Copyright (c) 2019, Mine2Gether.com
//
// Please see the included LICENSE file for more information.

package m2g.mine2gether.androidminer;

import java.util.ArrayList;

public class Config {

    public static final Config settings = new Config();

    public static final int defaultPoolIndex = 1;
    public static final String defaultWallet = "";
    public static final String defaultPassword = "";

    public static final String miner_xmrig = "XMRig";
    public static final String miner_violetminer = "violetminer";
    public static final String miner_ninjarig = "NinjaRig";
    public static final String miner_xmrig_upx = "XMRig-UPX";

    public static final String asset_xmrig = "xmrig";
    public static final String asset_violetminer = "violetminer";
    public static final String asset_ninjaminer = "ninjarig";
    public static final String asset_xmrig_upx = "xmrig-upx";

    public static final Integer logMaxLength = 50000;
    public static final Integer logPruneLength = 1000;

    private ArrayList<PoolItem> mPools = new ArrayList<PoolItem>();
    private ArrayList<AlgoItem> mAlgos = new ArrayList<AlgoItem>();


    public Config() {

        mAlgos.add(new AlgoItem("argon2/chukwa", miner_ninjarig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_ninjarig, "argon2/chukwa", asset_ninjaminer));
                add(new MinerItem(miner_violetminer, "chukwa", asset_violetminer));
                add(new MinerItem(miner_xmrig, "argon2/chukwa", asset_xmrig));

            }
        }));

        mAlgos.add(new AlgoItem("argon2/wrkz", miner_ninjarig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_ninjarig, "chukwa/wrkz", asset_ninjaminer));
                add(new MinerItem(miner_violetminer, "chukwa_wrkz", asset_violetminer));
                add(new MinerItem(miner_xmrig, "argon2/wrkz", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("rx/test", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "rx/test", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("rx/0", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "rx/0", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("rx/wow", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "rx/wow", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("rx/loki", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "rx/loki", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cn/fast", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "cn/fast", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cn/rwz", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "cn/rwz", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cn/zls", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "cn/zls", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cn/double", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "cn/double", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cn/r", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "cn/r", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cn/wow", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "cn/wow", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cn/gpu", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "cn/gpu", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cn-pico/trtl", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "rx/test", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cn/half", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "cn/half", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cn/2", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "cn/2", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cn/xao", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "cn/xao", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cn/rto", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "cn/rto", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cn-heavy/tube", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "cn-heavy/tube", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cn-heavy/xhv", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "cn-heavy/xhv", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cn-heavy/0", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "cn-heavy/0", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cn/1", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "cn/1", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cn-lite/1", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "cn-lite/1", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cn-lite/0", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "cn-lite/0", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cn/0", miner_xmrig, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig, "cn/0", asset_xmrig));
            }
        }));

        mAlgos.add(new AlgoItem("cryptonight-upx/2", miner_xmrig_upx, new ArrayList<MinerItem>() {
            {
                add(new MinerItem(miner_xmrig_upx, "cryptonight-upx/2", asset_xmrig_upx));
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
