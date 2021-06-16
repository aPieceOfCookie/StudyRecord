package com.language;

public class DcString  {

    /**
     * 可以没有参数，空参。
     * @param data
     */
    public void knowledge(String... data){
        for (String str :
                data) {
            System.out.println(str);
        }
    }

    /**
     * 必须有一个参数
     * @param data
     */
    public void asKnowledge(String[] data){
        for (String datum : data) {
            System.out.println(datum);
        }
    }
}
