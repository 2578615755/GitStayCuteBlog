package cn.huawei.staycuteblog.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-18
 */
@TableName("shuoshuo")
public class Shuoshuo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 说说记录ID
     */
	@TableId(value="shuo_id", type= IdType.AUTO)
	private Integer shuoId;
    /**
     * 用户ID
     */
	@TableField("user_id")
	private Integer userId;
    /**
     * 发布时间
     */
	@TableField("shuo_time")
	private Date shuoTime;
    /**
     * 说说发布时的IP地址
     */
	@TableField("shuo_ip")
	private String shuoIp;
    /**
     * 说说内容
     */
	private String shuoshuo;
    /**
     * 栏目ID,默认为3
     */
	@TableField("type_id")
	private Integer typeId;


	public Integer getShuoId() {
		return shuoId;
	}

	public void setShuoId(Integer shuoId) {
		this.shuoId = shuoId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getShuoTime() {
		return shuoTime;
	}

	public void setShuoTime(Date shuoTime) {
		this.shuoTime = shuoTime;
	}

	public String getShuoIp() {
		return shuoIp;
	}

	public void setShuoIp(String shuoIp) {
		this.shuoIp = shuoIp;
	}

	public String getShuoshuo() {
		return shuoshuo;
	}

	public void setShuoshuo(String shuoshuo) {
		this.shuoshuo = shuoshuo;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	@Override
	public String toString() {
		return "Shuoshuo{" +
			", shuoId=" + shuoId +
			", userId=" + userId +
			", shuoTime=" + shuoTime +
			", shuoIp=" + shuoIp +
			", shuoshuo=" + shuoshuo +
			", typeId=" + typeId +
			"}";
	}
}
