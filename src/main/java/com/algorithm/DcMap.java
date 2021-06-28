package com.algorithm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DcMap {
    /**
     * 上锁的map
     */
    public void sycList(){
        Map<String,String> map= Collections.synchronizedMap(new HashMap<String, String>());
        for (int i = 0; i < 10; i++) {
            map.put("22"+i,"你好");
        }
    }
}
