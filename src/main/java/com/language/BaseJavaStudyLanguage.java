package com.language;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: 一块儿小饼干
 * @ProjectName: StudyRecord
 * @Description: 基础java学习
 * @date: 2021/4/26 10:06
 */
public class BaseJavaStudyLanguage {

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
        //byte->Byte
    }

    /**
     * 正则表达式
     */
    public void reg(){
        String regx="1[3-9][0-9]\\d{8}";
        String str="的就开始啦就打开拉萨机开绿灯就撒开了15849130096大家ask了的艰苦拉萨机开绿灯撒";
        Pattern compile = Pattern.compile(regx);
        Matcher matcher = compile.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        /*BaseJavaStudyLanguage baseJavaStudyLanguage = new BaseJavaStudyLanguage();
        baseJavaStudyLanguage.reg();*/
    }
}
