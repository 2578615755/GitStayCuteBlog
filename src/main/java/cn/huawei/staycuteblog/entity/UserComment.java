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
@TableName("user_comment")
public class UserComment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论自增ID号
     */
	@TableId(value="c_id", type= IdType.AUTO)
	private Integer cId;
    /**
     * 收到评论的用户ID
     */
	@TableField("user_id")
	private Integer userId;
    /**
     * 评论栏目ID
     */
	@TableField("type_id")
	private Integer typeId;
    /**
     * 评论内容的ID
     */
	@TableField("commit_id")
	private Integer commitId;
    /**
     * 评论内容
     */
	@TableField("commit_content")
	private String commitContent;
    /**
     * 评论者ID
     */
	@TableField("commit_user_id")
	private Integer commitUserId;
    /**
     * 评论时间
     */
	@TableField("commit_time")
	private Date commitTime;
    /**
     * 评论时的IP地址
     */
	@TableField("commit_ip")
	private String commitIp;


	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getCommitId() {
		return commitId;
	}

	public void setCommitId(Integer commitId) {
		this.commitId = commitId;
	}

	public String getCommitContent() {
		return commitContent;
	}

	public void setCommitContent(String commitContent) {
		this.commitContent = commitContent;
	}

	public Integer getCommitUserId() {
		return commitUserId;
	}

	public void setCommitUserId(Integer commitUserId) {
		this.commitUserId = commitUserId;
	}

	public Date getCommitTime() {
		return commitTime;
	}

	public void setCommitTime(Date commitTime) {
		this.commitTime = commitTime;
	}

	public String getCommitIp() {
		return commitIp;
	}

	public void setCommitIp(String commitIp) {
		this.commitIp = commitIp;
	}

	@Override
	public String toString() {
		return "UserComment{" +
			", cId=" + cId +
			", userId=" + userId +
			", typeId=" + typeId +
			", commitId=" + commitId +
			", commitContent=" + commitContent +
			", commitUserId=" + commitUserId +
			", commitTime=" + commitTime +
			", commitIp=" + commitIp +
			"}";
	}
}
