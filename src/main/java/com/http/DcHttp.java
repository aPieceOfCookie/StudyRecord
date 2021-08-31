package com.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class DcHttp {
    public final static String BASE_URL="https://";
    public final static String ENCODING="utf-8";
    public final static String CONTENT_TYPE="application/x-www-form-urlencoded";
    public final static String METHOD_POST="POST";
    public final static String METHOD_GET="GET";

    /**
     * java自带的http请求
     * @param http
     * @return
     */
    public static String sendPost(DcHttp http){
        StringBuffer buffer = new StringBuffer();

        buffer.append(BASE_URL);
        buffer.append(http.getUrl());
        BufferedReader buffer1 = null;
        StringBuffer resultBuffer=null;

        HttpURLConnection connection=null;
        try {
            URL url=new URL(buffer.toString());
            connection=(HttpURLConnection) url.openConnection();
            connection.setRequestMethod(http.getMethod());
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setRequestProperty("content-type",CONTENT_TYPE);
            //connection.connect();
            //得到响应码
            int responseCode = connection.getResponseCode();
            System.out.println(responseCode);
            if(responseCode == HttpURLConnection.HTTP_OK){
                //得到响应流
                InputStream inputStream = connection.getInputStream();
                //将响应流转换成字符串
                resultBuffer = new StringBuffer();
                String line;
                buffer1 = new BufferedReader(new InputStreamReader(inputStream, "GBK"));
                while ((line = buffer1.readLine()) != null) {
                    resultBuffer.append(line);
                }
                return resultBuffer.toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    public static String doPost(){
        return "";
    }

    public DcHttp() {
    }

    public DcHttp(String url) {
        this.url = url;
    }

    public DcHttp(String url, Map<String, String> params) {
        this.url = url;
        this.params = params;
    }

    private String url;
    private Map<String,String> params;
    private String method;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }
}
