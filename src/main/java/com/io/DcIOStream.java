package com.io;


import java.io.*;
import java.net.URL;

public class DcIOStream {

    public final static String C_URL="c://";
    public final static String D_URL="d://";


    /**
     * 读取文件内容
     * @param filePath  路径
     * @return 结果
     */
    public String  getFileInfo(String filePath){
        FileInputStream fileInputStream=null;
        String result="";

        try {
            fileInputStream=new FileInputStream(filePath);
            //2. 返回这个输入流中可以被读的剩下的bytes字节的估计值；
            int available = fileInputStream.available();
            byte [] dataArr= new byte[available];
            fileInputStream.read(dataArr);

            result=new String(dataArr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result ;
    }

    /**
     * 将数据写到文件
     * @param path  路径
     * @param data  数据
     */
    public void writeToFile(String path,String data){
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream(path);
            byte[] dataBytes = data.getBytes();
            fileOutputStream.write(dataBytes);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 下载图片并转为File
     * @param url 文件url
     * @param fileType 文件类型
     */
    public static File getPic(String url,String fileType){
        File file=null;
        InputStream is=null;
        FileOutputStream fileOutputStream =null;
        try {
            //利用时间戳创建一个头像文件
            long timeMillis = System.currentTimeMillis();
            file=File.createTempFile(timeMillis+"",fileType);
            //下载
            URL picUrl=new URL(url);
            is=picUrl.openStream();
            fileOutputStream = new FileOutputStream(file);
            int byteReads = 0;
            //文件大小
            byte[] bytes = new byte[2048];
            //将数据写入文件
            while ((byteReads= is.read(bytes))!=-1){
                fileOutputStream.write(bytes,0,byteReads);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                if(is!=null){
                    is.close();
                }
                if(fileOutputStream!=null){
                    fileOutputStream.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        return file;
    }

}
