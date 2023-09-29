package com.design.pattern.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        LoggerFactory logger = new HtmlLogger();
        logger.log("HTML Logger");

        // easy to substitute, just change the factory, able open close principle
        logger = new XmlLogger();
        logger.log("XML Logger");
    }
}
