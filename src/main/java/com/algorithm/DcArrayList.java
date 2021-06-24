package com.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DcArrayList {
    public static void main(String[] args) {
        list();
    }
    public static void list(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        String a="a";
        String b="a";
        System.out.println(a.equals(b));
        System.out.println(a.hashCode()==b.hashCode());
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        Map<String,String> map=Collections.synchronizedMap(new HashMap<String, String>());
        for (int i = 0; i < 10; i++) {
            map.put("22"+i,"你好");
        }
    }
}
