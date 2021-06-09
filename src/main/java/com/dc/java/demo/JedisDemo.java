package com.dc.java.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dc.java.redis.DcJedisTools;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JedisDemo {

    public static void main(String[] args) {

    }

    public static void dcTools(){
        Jedis jedis = DcJedisTools.getJedis();

    }


    public static void demo1(){
        Jedis jedis =new Jedis();
        List<String> nameList=new ArrayList<String>();
        nameList.add("张胜男");
        nameList.add("李四");
        nameList.add("王五");
        Map<String,List<String>> data=new HashMap<String,List<String>>();
        data.put("data",nameList);
        String str= JSON.toJSONString(data);
        System.out.println(str);
        jedis.set("userList",str);
        String a=jedis.get("userList");
        System.out.println(a);
        JSONObject json=JSON.parseObject(str);
        System.out.println(json.get("data"));
        System.out.println(json);
    }

}
