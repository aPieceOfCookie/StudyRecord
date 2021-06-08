package com.dc.java.excel;


import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.dc.java.excel.model.StudentCourse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class DcEasyExcelTools extends AnalysisEventListener<StudentCourse> {
    private static final Logger LOGGER = LoggerFactory.getLogger(DcEasyExcelTools.class);
    private static final int BIG_COUNT=5;
    List<StudentCourse> list = new ArrayList<StudentCourse>();

    /**
     * 解析每一行
     * @param studentCourse
     * @param analysisContext
     */
    public void invoke(StudentCourse studentCourse, AnalysisContext analysisContext) {
        LOGGER.info("解析到一条数据:{}", studentCourse.getCourseName());
        list.add(studentCourse);
        if (list.size() >= BIG_COUNT) {
            saveData();
            // 存储完成清理 list
            list.clear();
        }
    }

    /**
     * 所有数据解析完毕后的操作
     * @param analysisContext
     */
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        saveData();
    }

    public void saveData(){
        for (StudentCourse c :
                list) {
            System.out.println(c.toString());
        }
        System.out.println("保存完毕");
    }
}
