package com.demo;

import com.quartz.DcQuartZ;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.concurrent.TimeUnit;

public class QuartDemo {

    public static void main(String[] args) {
        //创建调度器
        StdSchedulerFactory stdSchedulerFactory = new StdSchedulerFactory();
        try {
            Scheduler scheduler = stdSchedulerFactory.getScheduler();
            //创建JobDetail实例 job执行内容
            JobDetail detail= JobBuilder.newJob(DcQuartZ.class)
                    .withIdentity("job","group")
                    .build();

            SimpleTrigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger", "triggerGroup")
                    .startNow() //立即生效
                    .withSchedule(SimpleScheduleBuilder
                            .simpleSchedule()
                            //隔一秒一次
                            //.withIntervalInSeconds(1)
                            .repeatForever())
                    .build();
            CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "triggerGroup1")
                    .usingJobData("trigger1", "这是jobDetail1的trigger")
                    .startNow()//立即生效
                    .withSchedule(CronScheduleBuilder.cronSchedule("* 30 10 ? * 1/5 2018"))
                    .build();
            scheduler.scheduleJob(detail,trigger);
            System.out.println("start");
            scheduler.start();

            TimeUnit.MINUTES.sleep(1L);
            scheduler.shutdown();
            System.out.println("end");
        } catch (SchedulerException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
