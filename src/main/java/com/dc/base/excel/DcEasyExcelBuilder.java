package com.dc.java.excel;

import java.util.List;

public interface DcEasyExcelBuilder<T> {


    public void analysisEveryLine(T model);


    public void analysisAllData(List<T> list);
}
