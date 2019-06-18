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
@TableName("email_message")
public class EmailMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增ID号
     */
	@TableId(value="email_id", type= IdType.AUTO)
	private Integer emailId;
    /**
     * 用户邮箱地址
     */
	@TableField("email_num")
	private String emailNum;
    /**
     * 发送内容
     */
	private String contents;
    /**
     * 发送标题
     */
	@TableField("email_title")
	private String emailTitle;
    /**
     * 发送时间
     */
	@TableField("send_time")
	private Date sendTime;
    /**
     * 用户ID
     */
	@TableField("user_id")
	private Integer userId;


	public Integer getEmailId() {
		return emailId;
	}

	public void setEmailId(Integer emailId) {
		this.emailId = emailId;
	}

	public String getEmailNum() {
		return emailNum;
	}

	public void setEmailNum(String emailNum) {
		this.emailNum = emailNum;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getEmailTitle() {
		return emailTitle;
	}

	public void setEmailTitle(String emailTitle) {
		this.emailTitle = emailTitle;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "EmailMessage{" +
			", emailId=" + emailId +
			", emailNum=" + emailNum +
			", contents=" + contents +
			", emailTitle=" + emailTitle +
			", sendTime=" + sendTime +
			", userId=" + userId +
			"}";
	}
}
