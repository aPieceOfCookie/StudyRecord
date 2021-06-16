package com.excel.model;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class StudentCourse {

    //@ExcelProperty(index = 2)
    @ExcelProperty("课程号")
    private String courseNo;
    //@ExcelProperty("课程名")
    private String courseName;
    private String credit;
    //必修选修
    private String courseType;
    //人文社科类/自然科学类
    private String courseTypeS;
    //公共课，专业课
    private String courseTypeT;
    //基础课，主干课
    private String courseTypeF;
}
