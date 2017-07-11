// Generated code from Butter Knife. Do not modify!
package com.bachduong.bitwallet.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SendFragment$$ViewBinder<T extends com.bachduong.bitwallet.ui.SendFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558610, "field 'sendToAddressView'");
    target.sendToAddressView = finder.castView(view, 2131558610, "field 'sendToAddressView'");
    view = finder.findRequiredView(source, 2131558612, "field 'sendToStaticAddressView' and method 'onStaticAddressClick'");
    target.sendToStaticAddressView = finder.castView(view, 2131558612, "field 'sendToStaticAddressView'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onStaticAddressClick();
        }
      });
    view = finder.findRequiredView(source, 2131558616, "field 'sendCoinAmountView'");
    target.sendCoinAmountView = finder.castView(view, 2131558616, "field 'sendCoinAmountView'");
    view = finder.findRequiredView(source, 2131558617, "field 'sendLocalAmountView'");
    target.sendLocalAmountView = finder.castView(view, 2131558617, "field 'sendLocalAmountView'");
    view = finder.findRequiredView(source, 2131558611, "field 'addressError'");
    target.addressError = finder.castView(view, 2131558611, "field 'addressError'");
    view = finder.findRequiredView(source, 2131558618, "field 'amountError'");
    target.amountError = finder.castView(view, 2131558618, "field 'amountError'");
    view = finder.findRequiredView(source, 2131558619, "field 'amountWarning'");
    target.amountWarning = finder.castView(view, 2131558619, "field 'amountWarning'");
    view = finder.findRequiredView(source, 2131558594, "field 'scanQrCodeButton' and method 'handleScan'");
    target.scanQrCodeButton = finder.castView(view, 2131558594, "field 'scanQrCodeButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.handleScan();
        }
      });
    view = finder.findRequiredView(source, 2131558613, "field 'eraseAddressButton' and method 'onAddressClearClick'");
    target.eraseAddressButton = finder.castView(view, 2131558613, "field 'eraseAddressButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onAddressClearClick();
        }
      });
    view = finder.findRequiredView(source, 2131558620, "field 'txMessageButton'");
    target.txMessageButton = finder.castView(view, 2131558620, "field 'txMessageButton'");
    view = finder.findRequiredView(source, 2131558621, "field 'txMessageLabel'");
    target.txMessageLabel = finder.castView(view, 2131558621, "field 'txMessageLabel'");
    view = finder.findRequiredView(source, 2131558622, "field 'txMessageView'");
    target.txMessageView = finder.castView(view, 2131558622, "field 'txMessageView'");
    view = finder.findRequiredView(source, 2131558623, "field 'txMessageCounter'");
    target.txMessageCounter = finder.castView(view, 2131558623, "field 'txMessageCounter'");
    view = finder.findRequiredView(source, 2131558624, "field 'sendConfirmButton' and method 'onSendClick'");
    target.sendConfirmButton = finder.castView(view, 2131558624, "field 'sendConfirmButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onSendClick();
        }
      });
  }

  @Override public void unbind(T target) {
    target.sendToAddressView = null;
    target.sendToStaticAddressView = null;
    target.sendCoinAmountView = null;
    target.sendLocalAmountView = null;
    target.addressError = null;
    target.amountError = null;
    target.amountWarning = null;
    target.scanQrCodeButton = null;
    target.eraseAddressButton = null;
    target.txMessageButton = null;
    target.txMessageLabel = null;
    target.txMessageView = null;
    target.txMessageCounter = null;
    target.sendConfirmButton = null;
  }
}
