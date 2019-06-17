package cn.huawei.staycuteblog.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@ToString
@Entity
public class SecretMessage {
    /**
    * 自增私信ID
    */
    @Id
    @GeneratedValue
    private Integer secretId;

    /**
    * 发信者ID
    */
    private Integer sendId;

    /**
    * 收信者ID
    */
    private Integer receiveId;

    /**
    * 私信标题
    */
    private String messageTopic;

    /**
    * 私信内容
    */
    private String messageContent;
}