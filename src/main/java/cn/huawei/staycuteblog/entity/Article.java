package cn.huawei.staycuteblog.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Data
@ToString
@Entity
public class Article {
    /**
    * 日志自增ID号
    */
    @Id
    @GeneratedValue
    private Integer articleId;

    /**
    * 文章名称
    */
    private String articleName;

    /**
    * 发布时间
    */
    private String articleTime;

    /**
    * 发布IP
    */
    private String articleIp;

    /**
    * 查看人数
    */
    private Integer articleClick;

    /**
    * 所属分类
    */
    private Integer sortArticleId;

    /**
    * 所属用户ID
    */
    private Integer userId;

    /**
    * 栏目ID
    */
    private Integer typeId;

    /**
    * 文章的模式:0为私有，1为公开，2为仅好友查看
    */
    private Integer articleType;

    /**
    * 文章内容
    */
    private String articleContent;

    /**
    * 是否置顶:0为否，1为是
    */
    private Integer articleUp;

    /**
    * 是否博主推荐:0为否，1为是
    */
    private Integer articleSupport;
}