package cn.huawei.staycuteblog.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@ToString
@Entity
public class UserAttention {
    /**
    * 自增ID
    */
    @Id
    @GeneratedValue
    private Integer aId;

    /**
    * 用户ID
    */
    private Integer userId;

    /**
    * 关注ID
    */
    private Integer attentionId;
}