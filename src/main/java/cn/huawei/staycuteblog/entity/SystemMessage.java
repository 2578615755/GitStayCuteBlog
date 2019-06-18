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
@TableName("system_message")
public class SystemMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 系统通知ID
     */
	@TableId(value="system_id", type= IdType.AUTO)
	private Integer systemId;
    /**
     * 1时发送所有用户，0时则不采用
     */
	@TableField("send_default")
	private Integer sendDefault;
    /**
     * 通知内容
     */
	@TableField("system_content")
	private String systemContent;
    /**
     * 系统通知时间
     */
	@TableField("system_time")
	private Date systemTime;


	public Integer getSystemId() {
		return systemId;
	}

	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}

	public Integer getSendDefault() {
		return sendDefault;
	}

	public void setSendDefault(Integer sendDefault) {
		this.sendDefault = sendDefault;
	}

	public String getSystemContent() {
		return systemContent;
	}

	public void setSystemContent(String systemContent) {
		this.systemContent = systemContent;
	}

	public Date getSystemTime() {
		return systemTime;
	}

	public void setSystemTime(Date systemTime) {
		this.systemTime = systemTime;
	}

	@Override
	public String toString() {
		return "SystemMessage{" +
			", systemId=" + systemId +
			", sendDefault=" + sendDefault +
			", systemContent=" + systemContent +
			", systemTime=" + systemTime +
			"}";
	}
}
