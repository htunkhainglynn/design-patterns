package com.design.pattern.builder;

import org.junit.jupiter.api.Test;

public class Text {

    private final String text;
    private final String decoration;
    private final String color;
    private final String size;

    Text(Builder builder) {
        this.text = builder.text;
        this.decoration = builder.decoration;
        this.color = builder.color;
        this.size = builder.size;
    }

    public String getText() {
        return text;
    }

    public String getDecoration() {
        return decoration;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    static class Builder {
        private String text;
        private String decoration;
        private String color;
        private String size;

        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public Builder decoration(String decoration) {
            this.decoration = decoration;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Text build() {
            return new Text(this);
        }
    }
}