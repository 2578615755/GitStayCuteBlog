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
@TableName("photos")
public class Photos implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 相片ID
     */
	@TableId(value="photo_id", type= IdType.AUTO)
	private Integer photoId;
    /**
     * 相片名称
     */
	@TableField("photo_name")
	private String photoName;
    /**
     * 图片路径
     */
	@TableField("photo_src")
	private String photoSrc;
    /**
     * 图片描述
     */
	@TableField("photo_description")
	private String photoDescription;
    /**
     * 所属用户ID
     */
	@TableField("user_id")
	private Integer userId;
    /**
     * 所属相册ID
     */
	@TableField("sort_id")
	private Integer sortId;
    /**
     * 图片上传时间
     */
	@TableField("upload_time")
	private Date uploadTime;
    /**
     * 图片操作上传IP地址
     */
	@TableField("upload_ip")
	private String uploadIp;


	public Integer getPhotoId() {
		return photoId;
	}

	public void setPhotoId(Integer photoId) {
		this.photoId = photoId;
	}

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public String getPhotoSrc() {
		return photoSrc;
	}

	public void setPhotoSrc(String photoSrc) {
		this.photoSrc = photoSrc;
	}

	public String getPhotoDescription() {
		return photoDescription;
	}

	public void setPhotoDescription(String photoDescription) {
		this.photoDescription = photoDescription;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getSortId() {
		return sortId;
	}

	public void setSortId(Integer sortId) {
		this.sortId = sortId;
	}

	public Date getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	public String getUploadIp() {
		return uploadIp;
	}

	public void setUploadIp(String uploadIp) {
		this.uploadIp = uploadIp;
	}

	@Override
	public String toString() {
		return "Photos{" +
			", photoId=" + photoId +
			", photoName=" + photoName +
			", photoSrc=" + photoSrc +
			", photoDescription=" + photoDescription +
			", userId=" + userId +
			", sortId=" + sortId +
			", uploadTime=" + uploadTime +
			", uploadIp=" + uploadIp +
			"}";
	}
}
