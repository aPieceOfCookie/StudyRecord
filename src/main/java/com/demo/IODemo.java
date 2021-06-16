package com.demo;

import com.io.DcIOStream;

public class IODemo {
    public static void main(String[] args) {
        demo2();
    }

    public static void demo1(){
        DcIOStream dcIOStream=new DcIOStream();
        String url="demo.txt";
        String result=dcIOStream.getFileInfo(DcIOStream.D_URL+url);
        System.out.println(result);
    }

    public static void demo2(){
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < 50; i++) {
            str.append("Hello World!\n");
        }
        DcIOStream dcIOStream = new DcIOStream();
        dcIOStream.writeToFile(DcIOStream.D_URL+"dc.txt",str.toString());
    }
}
