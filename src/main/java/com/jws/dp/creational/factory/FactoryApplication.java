package com.jws.dp.creational.factory;

public class FactoryApplication {
    private Dialog dialog;

    public static void main(String[] args) throws Exception {
        FactoryApplication application1 = new FactoryApplication(args[0]);
        application1.render();

        FactoryApplication application2 = new FactoryApplication(args[1]);
        application2.render();
    }

    private FactoryApplication(String systemType) throws Exception {
        if ("Windows".equals(systemType)) {
            this.dialog = new WindowsDialogImpl();
        } else if ("Web".equals(systemType)) {
            this.dialog = new WebDialogImpl();
        } else {
            throw new Exception("Unknown system");
        }
    }

    private void render() {
        this.dialog.render();
    }
}
