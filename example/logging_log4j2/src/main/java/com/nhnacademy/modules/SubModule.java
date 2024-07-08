package com.nhnacademy.modules;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class SubModule {
    private static Logger logger = LogManager.getLogger(SubModule.class);

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
