package com.design.pattern.abstractfactory.tailwind.ui;

import com.design.pattern.abstractfactory.ui.Button;
import com.design.pattern.abstractfactory.ui.Table;
import com.design.pattern.abstractfactory.ui.Ui;

public class TailwindUi extends Ui {
    @Override
    public Button createButton() {
        return new TailwindButton();
    }

    @Override
    public Table createTable() {
        return new TailwindTable();
    }
}
