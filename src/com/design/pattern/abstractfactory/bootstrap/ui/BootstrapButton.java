package com.design.pattern.abstractfactory.bootstrap.ui;

import com.design.pattern.abstractfactory.ui.Button;

public class BootstrapButton extends Button {
    @Override
    public void renderButton() {
        System.out.println("Rendering Bootstrap button...");
    }
}
