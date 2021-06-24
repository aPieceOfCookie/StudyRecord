package com.timer;

import org.apache.poi.ss.formula.functions.T;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.*;

public class DcTimer {

    public static void main(String[] args) throws InterruptedException{
        /*Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("1000");
            }
        },1000);
        Thread.sleep(1000);
        timer.cancel();*/
        scheduled();
    }

    public static void scheduled(){
        ScheduledExecutorService service= Executors.newScheduledThreadPool(10);
        Runnable runnable=new Runnable() {
            public void run() {
                System.out.println("打印一个信息");
            }
        };
        service.scheduleAtFixedRate(runnable,5L,5L,TimeUnit.SECONDS);
    }
}
