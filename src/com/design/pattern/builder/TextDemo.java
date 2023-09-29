package com.design.pattern.builder;

public class TextDemo {

    public static void main(String[] args) {
        Text text = new Text.Builder()
                .text("Hello World")
                .decoration("bold")
                .color("red")
                .size("12")
                .build();
        System.out.println(text.getText());
        System.out.println(text.getDecoration());
        System.out.println(text.getColor());
        System.out.println(text.getSize());
    }
}
