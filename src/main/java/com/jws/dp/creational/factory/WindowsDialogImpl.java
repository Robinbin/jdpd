package com.jws.dp.creational.factory;

public class WindowsDialogImpl extends Dialog {
    public Button createButton() {
        return new WindowsButtonImpl();
    }
}
