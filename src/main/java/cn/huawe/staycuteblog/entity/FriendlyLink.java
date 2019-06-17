package cn.huawe.staycuteblog.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@ToString
@Entity
public class FriendlyLink {
    /**
    * 友情链接自增ID
    */
    @Id
    @GeneratedValue
    private Integer linkId;

    /**
    * 友情链接名称
    */
    private String linkName;

    /**
    * 链接地址
    */
    private String linkUrl;

    /**
    * LOGO图片
    */
    private String linkLogo;

    /**
    * 在页面显示的顺序
    */
    private Integer showOrder;
}