package cn.huawe.staycuteblog.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Data
@ToString
@Entity
public class Visitor {
    /**
    * 访客记录ID
    */
    @Id
    @GeneratedValue
    private Integer vId;

    /**
    * 访客ID
    */
    private Integer visitorId;

    /**
    * 来访时间
    */
    private String visitorTime;

    /**
    * 被访用户ID
    */
    private Integer userId;

    /**
    * 访客IP地址
    */
    private String visitorIp;

    /**
    * 访问板块ID
    */
    private Integer typeId;

    /**
    * 查看某板块的某个子项目，如查看相册板块的第3个相册，该ID对应该相册的ID号
    */
    private Integer whereId;
}