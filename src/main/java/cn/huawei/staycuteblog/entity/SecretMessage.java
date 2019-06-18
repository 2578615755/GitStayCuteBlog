package cn.huawei.staycuteblog.entity;

import com.baomidou.mybatisplus.enums.IdType;
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
@TableName("secret_message")
public class SecretMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增私信ID
     */
	@TableId(value="secret_id", type= IdType.AUTO)
	private Integer secretId;
    /**
     * 发信者ID
     */
	@TableField("send_id")
	private Integer sendId;
    /**
     * 收信者ID
     */
	@TableField("receive_id")
	private Integer receiveId;
    /**
     * 私信标题
     */
	@TableField("message_topic")
	private String messageTopic;
    /**
     * 私信内容
     */
	@TableField("message_content")
	private String messageContent;


	public Integer getSecretId() {
		return secretId;
	}

	public void setSecretId(Integer secretId) {
		this.secretId = secretId;
	}

	public Integer getSendId() {
		return sendId;
	}

	public void setSendId(Integer sendId) {
		this.sendId = sendId;
	}

	public Integer getReceiveId() {
		return receiveId;
	}

	public void setReceiveId(Integer receiveId) {
		this.receiveId = receiveId;
	}

	public String getMessageTopic() {
		return messageTopic;
	}

	public void setMessageTopic(String messageTopic) {
		this.messageTopic = messageTopic;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	@Override
	public String toString() {
		return "SecretMessage{" +
			", secretId=" + secretId +
			", sendId=" + sendId +
			", receiveId=" + receiveId +
			", messageTopic=" + messageTopic +
			", messageContent=" + messageContent +
			"}";
	}
}
