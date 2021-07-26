package com.excel;


import com.alibaba.excel.EasyExcel;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DcEasyExcelTools {

   private DcEasyExcelBuilder<T> builder;
   private File file;
   private Object[] extraData;
   private Class<T> cls;
   private Integer sheetNo;

    public DcEasyExcelTools(DcEasyExcelBuilder<T> builder, File file, Class<T> cls) {
        this.builder = builder;
        this.file = file;
        this.cls = cls;
    }

    public DcEasyExcelTools extraData(Object... extraData){
        this.extraData=extraData;
        return this;
    }

    public DcEasyExcelTools sheetNo(Integer sheetNo){
        this.sheetNo=sheetNo;
        return this;
    }

    public void parse(){
        new Thread(new Runnable() {
            public void run() {
                try {
                    FileInputStream fileInputStream=new FileInputStream(file);
                    EasyExcel.read(fileInputStream);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
