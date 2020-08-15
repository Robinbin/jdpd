package com.jws.dp.creational.factory;

public class WindowsButtonImpl implements Button {
    private String name;

    public void render() {
        System.out.println(name);
    }

    public void onClick() {
        name = "I am Windows Button";
    }
}
