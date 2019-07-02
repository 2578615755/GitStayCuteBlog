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
@TableName("article")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日志自增ID号
     */
	@TableId(value="article_id", type= IdType.AUTO)
	private Integer articleId;
    /**
     * 文章名称
     */
	@TableField("article_name")
	private String articleName;
    /**
     * 发布时间
     */
	@TableField("article_time")
	private Date articleTime;
    /**
     * 发布IP
     */
	@TableField("article_ip")
	private String articleIp;
    /**
     * 查看人数
     */
	@TableField("article_click")
	private Integer articleClick;
    /**
     * 所属分类
     */
	@TableField("sort_article_id")
	private Integer sortArticleId;
    /**
     * 所属用户ID
     */
	@TableField("user_id")
	private Integer userId;
    /**
     * 栏目ID
     */
	@TableField("type_id")
	private Integer typeId;
    /**
     * 文章的模式:0为私有，1为公开，2为仅好友查看
     */
	@TableField("article_type")
	private Integer articleType;
    /**
     * 文章内容
     */
	@TableField("article_content")
	private String articleContent;
    /**
     * 是否置顶:0为否，1为是
     */
	@TableField("article_up")
	private Integer articleUp;
    /**
     * 是否博主推荐:0为否，1为是
     */
	@TableField("article_support")
	private Integer articleSupport;

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public Date getArticleTime() {
		return articleTime;
	}

	public void setArticleTime(Date articleTime) {
		this.articleTime = articleTime;
	}

	public String getArticleIp() {
		return articleIp;
	}

	public void setArticleIp(String articleIp) {
		this.articleIp = articleIp;
	}

	public Integer getArticleClick() {
		return articleClick;
	}

	public void setArticleClick(Integer articleClick) {
		this.articleClick = articleClick;
	}

	public Integer getSortArticleId() {
		return sortArticleId;
	}

	public void setSortArticleId(Integer sortArticleId) {
		this.sortArticleId = sortArticleId;
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

	public Integer getArticleType() {
		return articleType;
	}

	public void setArticleType(Integer articleType) {
		this.articleType = articleType;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public Integer getArticleUp() {
		return articleUp;
	}

	public void setArticleUp(Integer articleUp) {
		this.articleUp = articleUp;
	}

	public Integer getArticleSupport() {
		return articleSupport;
	}

	public void setArticleSupport(Integer articleSupport) {
		this.articleSupport = articleSupport;
	}

	@Override
	public String toString() {
		return "Article{" +
			", articleId=" + articleId +
			", articleName=" + articleName +
			", articleTime=" + articleTime +
			", articleIp=" + articleIp +
			", articleClick=" + articleClick +
			", sortArticleId=" + sortArticleId +
			", userId=" + userId +
			", typeId=" + typeId +
			", articleType=" + articleType +
			", articleContent=" + articleContent +
			", articleUp=" + articleUp +
			", articleSupport=" + articleSupport +
			"}";
	}
}
