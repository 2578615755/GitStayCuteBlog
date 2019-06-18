package cn.huawei.staycuteblog.entity;

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
@TableName("about_blog")
public class AboutBlog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId("blog_id")
	private Integer blogId;
    /**
     * 博客关键字
     */
	@TableField("blog_keyword")
	private String blogKeyword;
    /**
     * 博客描述
     */
	@TableField("blog_description")
	private String blogDescription;
    /**
     * 博客名称
     */
	@TableField("blog_name")
	private String blogName;
    /**
     * 博客标题
     */
	@TableField("blog_title")
	private String blogTitle;


	public Integer getBlogId() {
		return blogId;
	}

	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}

	public String getBlogKeyword() {
		return blogKeyword;
	}

	public void setBlogKeyword(String blogKeyword) {
		this.blogKeyword = blogKeyword;
	}

	public String getBlogDescription() {
		return blogDescription;
	}

	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}

	public String getBlogName() {
		return blogName;
	}

	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	@Override
	public String toString() {
		return "AboutBlog{" +
			", blogId=" + blogId +
			", blogKeyword=" + blogKeyword +
			", blogDescription=" + blogDescription +
			", blogName=" + blogName +
			", blogTitle=" + blogTitle +
			"}";
	}
}
