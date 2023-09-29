package com.design.pattern.abstractfactory.tailwind.ui;

import com.design.pattern.abstractfactory.ui.Table;

public class TailwindTable extends Table {
    @Override
    public void renderTable() {
        System.out.println("Rendering Tailwind table...");
    }
}
