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
@TableName("photo_sort")
public class PhotoSort implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 相册ID
     */
	@TableId(value="sort_img_id", type= IdType.AUTO)
	private Integer sortImgId;
    /**
     * 相册名
     */
	@TableField("sort_img_name")
	private String sortImgName;
    /**
     * 展示方式 0->仅主人可见,1->输入密码即可查看,2->仅好友能查看,3->回答问题即可查看
     */
	@TableField("sort_img_type")
	private String sortImgType;
    /**
     * 查看密码
     */
	@TableField("img_password")
	private String imgPassword;
    /**
     * 所属用户ID
     */
	@TableField("user_id")
	private Integer userId;
    /**
     * 访问问题
     */
	@TableField("img_sort_question")
	private String imgSortQuestion;
    /**
     * 访问问题的答案
     */
	@TableField("img_sort_answer")
	private String imgSortAnswer;
    /**
     * 默认1表示相册板块
     */
	@TableField("type_id")
	private Integer typeId;
    /**
     * 封面图片的路径
     */
	@TableField("top_pic_src")
	private Integer topPicSrc;


	public Integer getSortImgId() {
		return sortImgId;
	}

	public void setSortImgId(Integer sortImgId) {
		this.sortImgId = sortImgId;
	}

	public String getSortImgName() {
		return sortImgName;
	}

	public void setSortImgName(String sortImgName) {
		this.sortImgName = sortImgName;
	}

	public String getSortImgType() {
		return sortImgType;
	}

	public void setSortImgType(String sortImgType) {
		this.sortImgType = sortImgType;
	}

	public String getImgPassword() {
		return imgPassword;
	}

	public void setImgPassword(String imgPassword) {
		this.imgPassword = imgPassword;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getImgSortQuestion() {
		return imgSortQuestion;
	}

	public void setImgSortQuestion(String imgSortQuestion) {
		this.imgSortQuestion = imgSortQuestion;
	}

	public String getImgSortAnswer() {
		return imgSortAnswer;
	}

	public void setImgSortAnswer(String imgSortAnswer) {
		this.imgSortAnswer = imgSortAnswer;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getTopPicSrc() {
		return topPicSrc;
	}

	public void setTopPicSrc(Integer topPicSrc) {
		this.topPicSrc = topPicSrc;
	}

	@Override
	public String toString() {
		return "PhotoSort{" +
			", sortImgId=" + sortImgId +
			", sortImgName=" + sortImgName +
			", sortImgType=" + sortImgType +
			", imgPassword=" + imgPassword +
			", userId=" + userId +
			", imgSortQuestion=" + imgSortQuestion +
			", imgSortAnswer=" + imgSortAnswer +
			", typeId=" + typeId +
			", topPicSrc=" + topPicSrc +
			"}";
	}
}
