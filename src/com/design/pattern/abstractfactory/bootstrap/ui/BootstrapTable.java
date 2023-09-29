package com.design.pattern.abstractfactory.bootstrap.ui;

import com.design.pattern.abstractfactory.ui.Table;

public class BootstrapTable extends Table {
    @Override
    public void renderTable() {
        System.out.println("Rendering Bootstrap table...");
    }
}
