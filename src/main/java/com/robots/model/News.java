package com.robots.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 虎扑新闻
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class News {
    private String id;
    /**
     * 标题
     */
    private String title;
    /**
     * 作者
     */
    private String writer;
    /**
     * 发布日期
     */
    private Date createDate;
    /**
     * 内容
     */
    private String content;

    /**
     * 详情页连接
     */
    private String url;
}
