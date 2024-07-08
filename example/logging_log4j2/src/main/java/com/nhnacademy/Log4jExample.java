package com.nhnacademy;

import org.apache.logging.log4j.Logger;

import com.nhnacademy.modules.SubModule;

import org.apache.logging.log4j.LogManager;

public class Log4jExample {

    private static Logger logger = LogManager.getLogger(Log4jExample.class);

    public static void main(String[] args) {
        logger.debug("Debug log message");
        SubModule.debugPrint();
        logger.info("Info log message");
        SubModule.infoPrint();
        logger.error("Error log message");
        SubModule.errorPrint();
    }
}