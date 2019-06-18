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
@TableName("article_sort")
public class ArticleSort implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章自增ID
     */
	@TableId(value="sort_article_id", type= IdType.AUTO)
	private Integer sortArticleId;
    /**
     * 该分类所属用户
     */
	@TableField("user_id")
	private Integer userId;
    /**
     * 分类名称
     */
	@TableField("sort_article_name")
	private String sortArticleName;


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

	public String getSortArticleName() {
		return sortArticleName;
	}

	public void setSortArticleName(String sortArticleName) {
		this.sortArticleName = sortArticleName;
	}

	@Override
	public String toString() {
		return "ArticleSort{" +
			", sortArticleId=" + sortArticleId +
			", userId=" + userId +
			", sortArticleName=" + sortArticleName +
			"}";
	}
}
