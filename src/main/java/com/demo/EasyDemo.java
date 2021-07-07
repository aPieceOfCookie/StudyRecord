package com.demo;

import com.alibaba.excel.EasyExcel;
import com.excel.DcEasyExcelBuilder;
import com.excel.DcEasyExcelTools;
import com.excel.model.StudentCourse;
import com.excel.model.StudentExport;
import com.io.DcIOStream;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class EasyDemo  implements DcEasyExcelBuilder<StudentCourse> {
    public static void main(String[] args) {
        //String filePath=DcIOStream.D_URL+"课程模板.xls";
        //File file=new File(filePath);
        //EasyExcel.read(file, StudentCourse.class,new DcEasyExcelTools<StudentCourse>()).sheet().doRead();
        exportInfo();
    }

    public static void dataModel(StudentCourse course){
        System.out.println(course.toString());
    }

    public void analysisEveryLine(StudentCourse model) {
        System.out.println(model.toString());
    }

    public void analysisAllData(List<StudentCourse> list) {

    }

    public static void exportInfo(){
        List<String> nameList=new ArrayList<String>();
        List<StudentExport> exportList=new ArrayList<StudentExport>();
        for (int i = 0; i < 10; i++) {
            String str="姓名："+Math.random()*10;
            System.out.println(str);
            StudentExport studentExport = new StudentExport();
            studentExport.setMemberName(str);
            exportList.add(studentExport);
            nameList.add(str);
        }
        EasyExcel.write("D:\\测试文件.xlsx", StudentExport.class).sheet("测试").doWrite(exportList);
    }
}
