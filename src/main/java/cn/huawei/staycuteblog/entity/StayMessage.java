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
@TableName("stay_message")
public class StayMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 留言表自增ID
     */
	@TableId(value="stay_id", type= IdType.AUTO)
	private Integer stayId;
    /**
     * 用户ID
     */
	@TableField("user_id")
	private Integer userId;
    /**
     * 留言者ID
     */
	@TableField("stay_user_id")
	private Integer stayUserId;
    /**
     * 留言内容
     */
	@TableField("message_content")
	private String messageContent;
    /**
     * 留言用户的IP地址
     */
	@TableField("stay_user_ip")
	private String stayUserIp;
    /**
     * 留言时间
     */
	@TableField("message_stay_time")
	private Date messageStayTime;
    /**
     * 地区
     */
	private String place;


	public Integer getStayId() {
		return stayId;
	}

	public void setStayId(Integer stayId) {
		this.stayId = stayId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getStayUserId() {
		return stayUserId;
	}

	public void setStayUserId(Integer stayUserId) {
		this.stayUserId = stayUserId;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public String getStayUserIp() {
		return stayUserIp;
	}

	public void setStayUserIp(String stayUserIp) {
		this.stayUserIp = stayUserIp;
	}

	public Date getMessageStayTime() {
		return messageStayTime;
	}

	public void setMessageStayTime(Date messageStayTime) {
		this.messageStayTime = messageStayTime;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "StayMessage{" +
			", stayId=" + stayId +
			", userId=" + userId +
			", stayUserId=" + stayUserId +
			", messageContent=" + messageContent +
			", stayUserIp=" + stayUserIp +
			", messageStayTime=" + messageStayTime +
			", place=" + place +
			"}";
	}
}
