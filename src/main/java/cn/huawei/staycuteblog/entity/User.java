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
public class User {
    /**
    * 用户ID
    */
    @Id
    @GeneratedValue
    private Integer userId;

    /**
    * 用户名
    */
    private String userName;

    /**
    * 用户密码
    */
    private String userPwd;

    /**
    * 用户手机号码
    */
    private Integer userPhone;

    /**
    * 用户性别
    */
    private String userSex;

    /**
    * 用户QQ号码
    */
    private Integer userQq;

    /**
    * 用户EMAIL地址
    */
    private String userEmail;

    /**
    * 用户地址
    */
    private String userAddress;

    /**
    * 用户积分
    */
    private Integer userMark;

    /**
    * 用户等级
    */
    private Integer userRankId;

    /**
    * 用户上一次登录IP地址
    */
    private String userLastLoginIp;

    /**
    * 自我描述
    */
    private String userDescription;

    /**
    * 用户头像存储路径
    */
    private String userImageUrl;

    /**
    * 毕业学校
    */
    private String userSchool;

    /**
    * 用户注册时间
    */
    private String userRegisterTime;

    /**
    * 用户注册时IP地址
    */
    private String userRegisterIp;

    /**
    * 用户上次更新博客时间
    */
    private String userLastUpdateTime;

    /**
    * 用户血型
    */
    private String userBloodType;

    /**
    * 用户签名
    */
    private String userSays;

    /**
    * 是否锁定，0为不锁定，1为锁定
    */
    private Integer userLock;

    /**
    * 是否冻结，0为不冻结，1为冻结
    */
    private Integer userFreeze;

    /**
    * 拥有权限
    */
    private String userPower;
}