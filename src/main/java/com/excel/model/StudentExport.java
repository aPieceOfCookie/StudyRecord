package com.excel.model;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class StudentExport {
    @ExcelProperty("姓名")
    private String memberName;
}
