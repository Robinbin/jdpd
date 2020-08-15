package com.jws.dp.creational.factory;

public class WebButtonImpl implements Button {
    private String name;

    public void render() {
        System.out.println(name);
    }

    public void onClick() {
        name = "I am Web Button";
    }
}
