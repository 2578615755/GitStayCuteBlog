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
public class StayMessage {
    /**
    * 留言表自增ID
    */
    @Id
    @GeneratedValue
    private Integer stayId;

    /**
    * 用户ID
    */
    private Integer userId;

    /**
    * 留言者ID
    */
    private Integer stayUserId;

    /**
    * 留言内容
    */
    private String messageContent;

    /**
    * 留言用户的IP地址
    */
    private String stayUserIp;

    /**
    * 留言时间
    */
    private String messageStayTime;

    /**
    * 地区
    */
    private String place;
}