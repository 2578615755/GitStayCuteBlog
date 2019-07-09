package cn.huawei.staycuteblog.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.ToString;

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
@Data
@ToString
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
     * 文章内容
     */
	@TableField("article_content")
	private String articleContent;
    /**
     * 发布人
     */
	@TableField("article_user")
	private String articleUser;

	/**
	 * 子类实体类
	 */
	private ArticleSortZi articleSortZi;
}
