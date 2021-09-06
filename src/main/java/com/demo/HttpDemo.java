package com.demo;

import com.http.DcHttp;

import java.io.File;

public class HttpDemo {
    public static void main(String[] args) {
        String url="www.zhihuilianzhong.com/login.jsp";
        DcHttp http = new DcHttp(url);
        http.setMethod(DcHttp.METHOD_GET);
        DcHttp.sendPost(http);
    }
}
