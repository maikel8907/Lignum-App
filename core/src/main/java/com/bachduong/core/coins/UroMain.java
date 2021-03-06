package com.bachduong.core.coins;

import com.bachduong.core.coins.families.BitFamily;

/**
 * @author FuzzyHobbit
 */
public class UroMain extends BitFamily {
    private static UroMain instance = new UroMain();

    private UroMain() {
        id = "uro.main";

        addressHeader = 68;
        p2shHeader = 5;
        acceptableAddressCodes = new int[]{addressHeader, p2shHeader};
        spendableCoinbaseDepth = 20;

        name = "Uro";
        symbol = "URO";
        uriScheme = "uro";
        bip44Index = 17;
        unitExponent = 8;
        feeValue = value(100000);
        minNonDust = value(1000); // 0.00001 URO mininput
        softDustLimit = value(100000); // 0.001 URO
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("Uro Signed Message:\n");
    }

    public static synchronized CoinType get() {
        return instance;
    }
}
