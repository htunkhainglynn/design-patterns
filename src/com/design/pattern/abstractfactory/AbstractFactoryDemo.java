package com.design.pattern.abstractfactory;

import com.design.pattern.abstractfactory.ui.Button;
import com.design.pattern.abstractfactory.ui.Table;
import com.design.pattern.abstractfactory.ui.Ui;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        try {
            Ui ui = Ui.getUi("tailwind");
            Button button = ui.createButton();
            Table table = ui.createTable();

            button.renderButton();
            table.renderTable();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
