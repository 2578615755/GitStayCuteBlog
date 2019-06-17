package cn.huawei.staycuteblog.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@ToString
@Entity
public class UserRank {
    /**
    * 自增ID
    */
    @Id
    @GeneratedValue
    private Integer rankId;

    /**
    * 等级ID
    */
    private Integer userRankId;

    /**
    * 等级积分
    */
    private Integer rankMark;

    /**
    * 等级名称
    */
    private String rankName;
}