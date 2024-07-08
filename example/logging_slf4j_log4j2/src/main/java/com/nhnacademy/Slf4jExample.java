package com.nhnacademy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nhnacademy.modules.SubModule;

public class Slf4jExample {

    private static Logger logger = LoggerFactory.getLogger(Slf4jExample.class);

    public static void main(String[] args) {
        logger.debug("Debug log message");
        SubModule.debugPrint();
        logger.info("Info log message");
        SubModule.infoPrint();
        logger.error("Error log message");
        SubModule.errorPrint();
    }
}