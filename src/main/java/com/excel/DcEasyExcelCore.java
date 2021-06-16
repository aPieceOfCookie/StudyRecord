package com.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class DcEasyExcelCore<T> extends AnalysisEventListener<T> {
    private static final Logger LOGGER = LoggerFactory.getLogger(DcEasyExcelTools.class);
    private static final int BIG_COUNT=5;
    private DcEasyExcelBuilder<T> analysis;

    List<T> list = new ArrayList<T>();


    /**
     * 解析每一行
     * @param model
     * @param analysisContext
     */
    public void invoke(T model, AnalysisContext analysisContext) {
        LOGGER.info("解析到一条数据:{}",model.toString());
        analysis.analysisEveryLine(model);
        list.add(model);
    }

    /**
     * 所有数据解析完毕后的操作
     * @param analysisContext
     */
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        analysis.analysisAllData(list);
    }


}
