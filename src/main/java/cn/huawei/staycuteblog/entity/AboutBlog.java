package cn.huawei.staycuteblog.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@ToString
@Entity
public class AboutBlog {
    /**
    * 用户ID
    */
    @Id
    @GeneratedValue
    private Integer blogId;

    /**
    * 博客关键字
    */
    private String blogKeyword;

    /**
    * 博客描述
    */
    private String blogDescription;

    /**
    * 博客名称
    */
    private String blogName;

    /**
    * 博客标题
    */
    private String blogTitle;

}