package cn.huawei.staycuteblog.entity;

import com.baomidou.mybatisplus.enums.IdType;
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
@TableName("article_sort")
@Data
@ToString
public class ArticleSort implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章自增ID
     */
	@TableId(value="sort_article_id", type= IdType.AUTO)
	private Integer sortArticleId;
    /**
     * 分类名称
     */
	@TableField("sort_article_name")
	private String sortArticleName;
}
