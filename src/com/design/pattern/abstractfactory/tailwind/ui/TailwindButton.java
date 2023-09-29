package com.design.pattern.abstractfactory.tailwind.ui;

import com.design.pattern.abstractfactory.ui.Button;

public class TailwindButton extends Button {
    @Override
    public void renderButton() {
        System.out.println("Rendering Tailwind button...");
    }
}
