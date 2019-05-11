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

        mAlgos.add(new AlgoItem("cn", ""));
        mAlgos.add(new AlgoItem("cn/0", ""));
        mAlgos.add(new AlgoItem("cn/1", ""));
        mAlgos.add(new AlgoItem("cn/2", ""));
        mAlgos.add(new AlgoItem("cn/xtl", ""));
        mAlgos.add(new AlgoItem("cn/msr", ""));
        mAlgos.add(new AlgoItem("cn/xao", ""));
        mAlgos.add(new AlgoItem("cn/rto", ""));
        mAlgos.add(new AlgoItem("cn/half", ""));
        mAlgos.add(new AlgoItem("cn/gpu", ""));
        mAlgos.add(new AlgoItem("cn/wow", ""));
        mAlgos.add(new AlgoItem("cn/r", ""));
        mAlgos.add(new AlgoItem("cn/rwz", ""));
        mAlgos.add(new AlgoItem("cn/zls", ""));
        mAlgos.add(new AlgoItem("cn/double", ""));
        mAlgos.add(new AlgoItem("cn-lite", ""));
        mAlgos.add(new AlgoItem("cn-lite/0", ""));
        mAlgos.add(new AlgoItem("cn-lite/1", ""));
        mAlgos.add(new AlgoItem("cn-lite/ipbc", ""));
        mAlgos.add(new AlgoItem("cn-heavy", ""));
        mAlgos.add(new AlgoItem("cn-heavy/xhv", ""));
        mAlgos.add(new AlgoItem("cn-heavy/tube", ""));
        mAlgos.add(new AlgoItem("cn-pico/trtl", ""));
        mAlgos.add(new AlgoItem("cryptonight-upx/2", "-upx"));

        //User Defined
        mPools.add(new PoolItem("custom", "custom", "", "", "", "", "", "", ""));

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

        // Loki Network (LOKI) + Turtlecoin (TRTL) Merged Mining|loki.pool.mine2gether.com:2221|cn-pico/trtl
        mPools.add(new PoolItem(
                        "loki",
                        "Loki Network (LOKI) + Turtlecoin (TRTL) Merged Mining",
                        "loki.pool.mine2gether.com:2221",
                        "cn-pico/trtl",
                        "https://loki.mine2gether.com/api",
                        "https://loki.mine2gether.com",
                        "https://loki.mine2gether.com/#my_stats",
                        "https://loki.mine2gether.com/#getting_started",
                        "https://trtl.mine2gether.com/api"
                )
        );

        // XtendCash (XTNC) + Turtlecoin (TRTL) Merged Mining|xtnc.pool.mine2gether.com:2222|cn-pico/trtl
        mPools.add(new PoolItem(
                        "xtnc",
                        "XtendCash (XTNC) + Turtlecoin (TRTL) Merged Mining",
                        "xtnc.pool.mine2gether.com:2222",
                        "cn-pico/trtl",
                        "https://xtnc.mine2gether.com/api",
                        "https://xtnc.mine2gether.com",
                        "https://xtnc.mine2gether.com/#my_stats",
                        "https://xtnc.mine2gether.com/#getting_started",
                        "https://trtl.mine2gether.com/api"
                )
        );

        // Turtlecoin (TRTL)|trtl.pool.mine2gether.com:2225|cn-pico/trtl
        mPools.add(new PoolItem(
                        "trtl",
                        "Turtlecoin (TRTL)",
                        "trtl.pool.mine2gether.com:2225",
                        "cn-pico/trtl",
                        "https://trtl.mine2gether.com/api",
                        "https://trtl.mine2gether.com",
                        "https://trtl.mine2gether.com/#my_stats",
                        "https://trtl.mine2gether.com/#getting_started",
                        "https://trtl.mine2gether.com/api"
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

        // Citadel (CTL)|ctl.pool.mine2gether.com:1114|cn/1
        mPools.add(new PoolItem(
                        "ctl",
                        "Citadel (CTL)",
                        "ctl.pool.mine2gether.com:1114",
                        "cn/1",
                        "https://ctl.mine2gether.com/api",
                        "https://ctl.mine2gether.com",
                        "https://ctl.mine2gether.com/#my_stats",
                        "https://ctl.mine2gether.com/#getting_started",
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
