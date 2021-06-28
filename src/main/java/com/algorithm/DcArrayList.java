package com.algorithm;

import java.util.*;

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
    }

    public static void link(){
        List<String> list = new LinkedList<String>();
    }


}
