package com.demo;

import com.excel.DcEasyExcelBuilder;
import com.excel.model.StudentCourse;
import com.io.DcIOStream;

import java.io.File;
import java.util.List;

public class EasyDemo  implements DcEasyExcelBuilder<StudentCourse> {
    public static void main(String[] args) {
        String filePath=DcIOStream.D_URL+"课程模板.xls";
        File file=new File(filePath);
        //EasyExcel.read(file, StudentCourse.class,new DcEasyExcelTools<StudentCourse>()).sheet().doRead();
    }

    public static void dataModel(StudentCourse course){
        System.out.println(course.toString());
    }

    public void analysisEveryLine(StudentCourse model) {
        System.out.println(model.toString());
    }

    public void analysisAllData(List<StudentCourse> list) {

    }
}
