package com.bachduong.core.coins;

import com.bachduong.core.coins.families.BitFamily;

/**
 * @author Ahmed Bodiwala
 */
public class RichcoinMain extends BitFamily {
    private static RichcoinMain instance = new RichcoinMain();

    private RichcoinMain() {
        id = "richcoin.main";

        addressHeader = 61;
        p2shHeader = 9;
        acceptableAddressCodes = new int[]{addressHeader, p2shHeader};
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 128;

        name = "Richcoin (beta)";
        symbol = "RICHX";
        uriScheme = "richcoin";
        bip44Index = 80;
        unitExponent = 8;
        feeValue = value(100000);
        minNonDust = value(1000000);
        softDustLimit = value(100000000);
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("Richcoin Signed Message:\n");

    }

    public static synchronized RichcoinMain get() {
        return instance;
    }
}
