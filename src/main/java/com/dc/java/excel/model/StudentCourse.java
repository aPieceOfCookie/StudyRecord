package com.dc.java.excel.model;

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
    private String courseType;	//必修选修
    private String courseTypeS;//人文社科类/自然科学类
    private String courseTypeT;//公共课，专业课
    private String courseTypeF;//基础课，主干课
}
