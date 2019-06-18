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
@TableName("user_attention")
public class UserAttention implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     */
	@TableId(value="a_id", type= IdType.AUTO)
	private Integer aId;
    /**
     * 用户ID
     */
	@TableField("user_id")
	private Integer userId;
    /**
     * 关注ID
     */
	@TableField("attention_id")
	private Integer attentionId;


	public Integer getaId() {
		return aId;
	}

	public void setaId(Integer aId) {
		this.aId = aId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getAttentionId() {
		return attentionId;
	}

	public void setAttentionId(Integer attentionId) {
		this.attentionId = attentionId;
	}

	@Override
	public String toString() {
		return "UserAttention{" +
			", aId=" + aId +
			", userId=" + userId +
			", attentionId=" + attentionId +
			"}";
	}
}
