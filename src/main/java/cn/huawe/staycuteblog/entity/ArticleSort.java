package cn.huawe.staycuteblog.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@ToString
@Entity
public class ArticleSort {
    /**
    * 文章自增ID
    */
    @Id
    @GeneratedValue
    private Integer sortArticleId;

    /**
    * 该分类所属用户
    */
    private Integer userId;

    /**
    * 分类名称
    */
    private String sortArticleName;
}