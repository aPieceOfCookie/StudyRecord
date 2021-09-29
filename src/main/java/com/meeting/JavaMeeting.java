package com.meeting;

import com.entity.Student;

import javax.management.Query;
import java.lang.reflect.Constructor;

/**
 * @Author {一块儿小饼干}
 * @ProjectName StudyRecord
 * @Description java面试题
 * @Date 2021/8/19 12:49
 **/
public class JavaMeeting {

    public void method(){
        try {
            Student.class.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    

}

