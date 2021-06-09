package com.dc.java.excel;


import org.apache.poi.ss.formula.functions.T;

import java.io.File;

public class DcEasyExcelTools {
   private DcEasyExcelBuilder<T> builder;
   private File file;
   private Object[] extraData;
    private Class<T> cls;

    public DcEasyExcelTools(DcEasyExcelBuilder<T> builder, File file, Class<T> cls) {
        this.builder = builder;
        this.file = file;
        this.cls = cls;
    }
}
