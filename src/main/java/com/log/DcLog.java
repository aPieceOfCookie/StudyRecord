package com.log;


import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class DcLog {

    private static Log logger= LogFactory.getLog(DcLog.class);
    public static void main(String[] args) {
        System.out.println(logger);
    }
}
