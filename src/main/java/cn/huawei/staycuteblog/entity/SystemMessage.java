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
public class SystemMessage {
    /**
    * 系统通知ID
    */
    @Id
    @GeneratedValue
    private Integer systemId;

    /**
    * 1时发送所有用户，0时则不采用
    */
    private Integer sendDefault;

    /**
    * 通知内容
    */
    private String systemContent;

    /**
    * 系统通知时间
    */
    private String systemTime;
}