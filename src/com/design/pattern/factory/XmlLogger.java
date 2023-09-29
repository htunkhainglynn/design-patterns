package com.design.pattern.factory;

public class XmlLogger implements LoggerFactory{

        @Override
        public void log(String message) {
            System.out.println("XmlLogger: " + message);
        }
}
