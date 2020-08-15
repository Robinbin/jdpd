package com.jws.dp.creational.factory;

public abstract class Dialog {
    public void render() {
        Button btn = createButton();
        btn.onClick();
        btn.render();
    }

    public abstract Button createButton();
}
