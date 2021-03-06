package com.bachduong.core.coins;

import com.bachduong.core.coins.families.PeerFamily;

/**
 * @author John L. Jegutanis
 */
public class NovacoinMain extends PeerFamily {
    private static NovacoinMain instance = new NovacoinMain();

    private NovacoinMain() {
        id = "novacoin.main";

        addressHeader = 8;
        p2shHeader = 20;
        acceptableAddressCodes = new int[]{addressHeader, p2shHeader};
        spendableCoinbaseDepth = 520;
        dumpedPrivateKeyHeader = 136;

        name = "Novacoin";
        symbol = "NVC";
        uriScheme = "novacoin";
        bip44Index = 50;
        unitExponent = 6;
        feeValue = value(1000); // 0.001 NVC
        minNonDust = value(1);
        softDustLimit = value(10000); // 0.01 NVC
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
    }

    public static synchronized NovacoinMain get() {
        return instance;
    }
}
