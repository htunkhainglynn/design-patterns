package com.design.pattern.abstractfactory.bootstrap.ui;

import com.design.pattern.abstractfactory.ui.Button;
import com.design.pattern.abstractfactory.ui.Table;
import com.design.pattern.abstractfactory.ui.Ui;

public class BootstrapUi extends Ui {
    @Override
    public Button createButton() {
        return new BootstrapButton();
    }

    @Override
    public Table createTable() {
        return new BootstrapTable();
    }
}
