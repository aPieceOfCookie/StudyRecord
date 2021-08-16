package com.robots;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * 爬虫jsoup学习(以虎扑新闻为例)
 */
public class RobotsUtils {

    public static void jsoupList(String url){
        try {
            Document document = Jsoup.connect(url).get();
            Elements select = document.select("#container > div > div > div.bbs-index-web-holder > div > div.bbs-index-web-middle > div:nth-child(2) > div");
            int i=1;
            for (Element e :
                    select) {
                while(true){
                    //获取每行的新闻记录
                    Element eveLine = e.getElementById("newpcnews-" + i);
                    if(eveLine==null){
                        break;
                    }
                    //获取所有标签
                    String a = eveLine.attr("a");
                    Elements title = eveLine.getElementsByClass("item-title-conent");
                    for (Element tit :
                            title) {
                        String s = tit.ownText();
                        System.out.println(s);
                    }
                    Elements content = eveLine.getElementsByClass("list-item-desc list-item-desc-has");
                    for (Element con :
                            content) {
                        String s = con.ownText();
                        System.out.println(s);
                    }

                    System.out.println("第"+i+"条");
                    i++;
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}
