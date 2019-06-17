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
public class UserComment {
    /**
    * 评论自增ID号
    */
    @Id
    @GeneratedValue
    private Integer cId;

    /**
    * 收到评论的用户ID
    */
    private Integer userId;

    /**
    * 评论栏目ID
    */
    private Integer typeId;

    /**
    * 评论内容的ID
    */
    private Integer commitId;

    /**
    * 评论内容
    */
    private String commitContent;

    /**
    * 评论者ID
    */
    private Integer commitUserId;

    /**
    * 评论时间
    */
    private String commitTime;

    /**
    * 评论时的IP地址
    */
    private String commitIp;
}