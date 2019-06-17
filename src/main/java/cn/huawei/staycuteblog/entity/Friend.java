package cn.huawei.staycuteblog.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@ToString
@Entity
public class Friend {
    /**
    * 自增ID
    */
    @Id
    @GeneratedValue
    private Integer fId;

    /**
    * 用户ID
    */
    private Integer userId;

    /**
    * 好友ID
    */
    private Integer friendId;
}