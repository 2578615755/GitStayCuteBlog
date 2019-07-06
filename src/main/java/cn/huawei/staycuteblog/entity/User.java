package cn.huawei.staycuteblog.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-18
 */
@TableName("user")
@Data
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
	@TableId(value="user_id", type= IdType.AUTO)
	private Integer userId;
    /**
     * 用户名
     */
	@TableField("user_name")
	private String userName;
    /**
     * 用户密码
     */
	@TableField("user_pwd")
	private String userPwd;
    /**
     * 用户昵称
     */
	@TableField("user_username")
	private String userUserName;
    /**
     * 用户手机号码
     */
	@TableField("user_phone")
	private String userPhone;
    /**
     * 用户性别
     */
	@TableField("user_sex")
	private String userSex;
    /**
     * 用户QQ号码
     */
	@TableField("user_qq")
	private String userQq;
    /**
     * 用户EMAIL地址
     */
	@TableField("user_email")
	private String userEmail;
    /**
     * 用户地址
     */
	@TableField("user_address")
	private String userAddress;
    /**
     * 用户积分
     */
	@TableField("user_mark")
	private Integer userMark;
    /**
     * 用户等级
     */
	@TableField("user_rank_id")
	private Integer userRankId;
    /**
     * 用户上一次登录IP地址
     */
	@TableField("user_last_login_ip")
	private String userLastLoginIp;
    /**
     * 自我描述
     */
	@TableField("user_description")
	private String userDescription;
    /**
     * 用户头像存储路径
     */
	@TableField("user_image_url")
	private String userImageUrl;
    /**
     * 毕业学校
     */
	@TableField("user_school")
	private String userSchool;
    /**
     * 用户注册时间
     */
	@TableField("user_register_time")
	private Date userRegisterTime;
    /**
     * 用户注册时IP地址
     */
	@TableField("user_register_ip")
	private String userRegisterIp;
    /**
     * 用户上次更新博客时间
     */
	@TableField("user_last_update_time")
	private Date userLastUpdateTime;
    /**
     * 用户血型
     */
	@TableField("user_blood_type")
	private String userBloodType;
    /**
     * 用户签名
     */
	@TableField("user_says")
	private String userSays;
    /**
     * 是否冻结，0为不冻结，1为冻结
     */
	@TableField("user_freeze")
	private String userFreeze;
    /**
     * 拥有权限
     */
	@TableField("user_power")
	private String userPower;
}
