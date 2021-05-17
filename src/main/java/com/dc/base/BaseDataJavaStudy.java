package com.dc.base;

/**
 * @author: 一块儿小饼干
 * @ProjectName: StudyRecord
 * @Description: 基础java学习
 * @date: 2021/4/26 10:06
 */
public class BaseDataJavaStudy {

    /**
     * 常见的数据类型及其对应的封装类
     */
    public void baseClass(){
        //int->Integer
        //char->Character
        //long->Long
        //bool->Boolean
        //double->Double
        //short->Short
    }

    /**
     * byte->Byte
     * @return
     */
    public static Byte byteStudy(){
        Byte a= (byte) 0;
        String name="11";
        Byte b=new Byte(name);
        System.out.println(b);

        return null;
    }

    public static void main(String[] args) {
        String a="";
        byteStudy();
    }
}
