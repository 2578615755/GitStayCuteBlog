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
public class EmailMessage {
    /**
    * 自增ID号
    */
    @Id
    @GeneratedValue
    private Integer emailId;

    /**
    * 用户邮箱地址
    */
    private String emailNum;

    /**
    * 发送内容
    */
    private String contents;

    /**
    * 发送标题
    */
    private String emailTitle;

    /**
    * 发送时间
    */
    private String sendTime;

    /**
    * 用户ID
    */
    private Integer userId;

}