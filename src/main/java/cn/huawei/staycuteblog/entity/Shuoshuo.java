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
public class Shuoshuo {
    /**
    * 说说记录ID
    */
    @Id
    @GeneratedValue
    private Integer shuoId;

    /**
    * 用户ID
    */
    private Integer userId;

    /**
    * 发布时间
    */
    private String shuoTime;

    /**
    * 说说发布时的IP地址
    */
    private String shuoIp;

    /**
    * 说说内容
    */
    private String shuoshuo;

    /**
    * 栏目ID,默认为3
    */
    private Integer typeId;
}