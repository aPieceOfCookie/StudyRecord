package com.dc.java.demo;

import com.alibaba.excel.EasyExcel;
import com.dc.java.excel.DcEasyExcelTools;
import com.dc.java.excel.model.StudentCourse;
import com.dc.java.io.DcIOStream;

import java.io.File;
import java.io.FileInputStream;

public class EasyDemo {
    public static void main(String[] args) {
        DcIOStream ioStream=new DcIOStream();
        String filePath=DcIOStream.D_URL+"课程模板.xls";
        File file=new File(filePath);
        EasyExcel.read(file, StudentCourse.class, new DcEasyExcelTools()).sheet().doRead();
        //ioStream.getFileInfo(filePath);
    }

    public static void dataModel(StudentCourse course){
        System.out.println(course.toString());
    }
}
