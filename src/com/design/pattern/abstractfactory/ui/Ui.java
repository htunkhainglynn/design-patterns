package com.design.pattern.abstractfactory.ui;

import com.design.pattern.abstractfactory.bootstrap.ui.BootstrapUi;
import com.design.pattern.abstractfactory.tailwind.ui.TailwindUi;

public abstract class Ui {
    public abstract Button createButton();
    public abstract Table createTable();

    public static Ui getUi(String uiType) {
        if (uiType.equalsIgnoreCase("bootstrap")) {
            return new BootstrapUi();
        } else if (uiType.equalsIgnoreCase("tailwind")) {
            return new TailwindUi();
        }
        throw new RuntimeException("Invalid ui type");
    }
}
