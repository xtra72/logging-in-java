package com.nhnacademy.modules;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubModule {
    private static Logger logger = LoggerFactory.getLogger(SubModule.class);

    private SubModule() {
    }

    public static void debugPrint() {
        logger.debug("Debug log message");
    }

    public static void infoPrint() {
        logger.info("Info log message");
    }

    public static void errorPrint() {
        logger.error("Error log message");
    }
}
