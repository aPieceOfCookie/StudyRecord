package com.quartz;

import org.apache.xmlbeans.impl.common.XPath;
import org.quartz.CronTrigger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DcQuartZ implements Job {

    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        String format = new SimpleDateFormat("yy-MM-dd hh:mm:ss").format(new Date());
        System.out.println("date:"+format);
    }
}
