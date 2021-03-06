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
@TableName("visitor")
public class Visitor implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 访客记录ID
     */
	@TableId(value="v_id", type= IdType.AUTO)
	private Integer vId;
    /**
     * 访客ID
     */
	@TableField("visitor_id")
	private Integer visitorId;
    /**
     * 来访时间
     */
	@TableField("visitor_time")
	private Date visitorTime;
    /**
     * 被访用户ID
     */
	@TableField("user_id")
	private Integer userId;
    /**
     * 访客IP地址
     */
	@TableField("visitor_ip")
	private String visitorIp;
    /**
     * 访问板块ID
     */
	@TableField("type_id")
	private Integer typeId;
    /**
     * 查看某板块的某个子项目，如查看相册板块的第3个相册，该ID对应该相册的ID号
     */
	@TableField("where_id")
	private Integer whereId;


	public Integer getvId() {
		return vId;
	}

	public void setvId(Integer vId) {
		this.vId = vId;
	}

	public Integer getVisitorId() {
		return visitorId;
	}

	public void setVisitorId(Integer visitorId) {
		this.visitorId = visitorId;
	}

	public Date getVisitorTime() {
		return visitorTime;
	}

	public void setVisitorTime(Date visitorTime) {
		this.visitorTime = visitorTime;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getVisitorIp() {
		return visitorIp;
	}

	public void setVisitorIp(String visitorIp) {
		this.visitorIp = visitorIp;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getWhereId() {
		return whereId;
	}

	public void setWhereId(Integer whereId) {
		this.whereId = whereId;
	}

	@Override
	public String toString() {
		return "Visitor{" +
			", vId=" + vId +
			", visitorId=" + visitorId +
			", visitorTime=" + visitorTime +
			", userId=" + userId +
			", visitorIp=" + visitorIp +
			", typeId=" + typeId +
			", whereId=" + whereId +
			"}";
	}
}
