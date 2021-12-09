package com.kyu.chess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.info("Hello Logback info");
        logger.debug("Hello Logback debug");
        logger.warn("Hello Logback warn");
    }
}
