package com.jws.dp.creational.factory;

public class WebDialogImpl extends Dialog {
    public Button createButton() {
        return new WebButtonImpl();
    }
}
