# IO流

## 1,分类

​	一般就是两种说法，1，输入输出流.2，字符字节流



## 2，举例


``` java
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
```

``` java

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
```

