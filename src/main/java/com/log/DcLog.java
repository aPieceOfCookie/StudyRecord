package com.log;


import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
public class DcLog {

    private static Log logger= LogFactory.getLog(DcLog.class);
    public static void main(String[] args) {
        System.out.println(logger);
    }
}
