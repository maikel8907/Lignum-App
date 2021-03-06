package com.bachduong.bitwallet.ui2;

import android.support.v4.app.FragmentActivity;

import com.bachduong.bitwallet.WalletApplication;

/**
 * @author John L. Jegutanis
 */
abstract public class AbstractWalletFragmentActivity extends FragmentActivity {

    protected WalletApplication getWalletApplication() {
        return (WalletApplication) getApplication();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        getWalletApplication().touchLastResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
//        getWalletApplication().touchLastStop();
    }
}
