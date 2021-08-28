package com.meeting;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class JavaInformation {


    /**
     * HashMap、LinkedHashMap、ConcurrentHashMap、ArrayList、LinkedList的底层实现。
     * hashMap: 底层是map
     */
    public void collInfo(){
        Map<String,String> map=new HashMap<>();
        Map<String,String> lMap=new LinkedHashMap<>();

        Collections.synchronizedMap(map);
    }

    /**
     * 实现callable接口，重写call方法<br>
     * 此方法是有返回值的
     * 并发编程
     */
    public void callableFn(){
        class Demo implements Callable<Integer>{

            @Override
            public Integer call() throws Exception {
                return null;
            }
        }
        Demo demo = new Demo();
        FutureTask<Integer> task = new FutureTask<Integer>(demo);
    }

    public static void main(String[] args) {
    }
}
