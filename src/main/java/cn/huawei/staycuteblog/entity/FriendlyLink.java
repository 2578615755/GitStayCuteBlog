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
@TableName("friendly_link")
public class FriendlyLink implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 友情链接自增ID
     */
	@TableId(value="link_id", type= IdType.AUTO)
	private Integer linkId;
    /**
     * 友情链接名称
     */
	@TableField("link_name")
	private String linkName;
    /**
     * 链接地址
     */
	@TableField("link_url")
	private String linkUrl;
    /**
     * LOGO图片
     */
	@TableField("link_logo")
	private String linkLogo;
    /**
     * 在页面显示的顺序
     */
	@TableField("show_order")
	private Integer showOrder;


	public Integer getLinkId() {
		return linkId;
	}

	public void setLinkId(Integer linkId) {
		this.linkId = linkId;
	}

	public String getLinkName() {
		return linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getLinkLogo() {
		return linkLogo;
	}

	public void setLinkLogo(String linkLogo) {
		this.linkLogo = linkLogo;
	}

	public Integer getShowOrder() {
		return showOrder;
	}

	public void setShowOrder(Integer showOrder) {
		this.showOrder = showOrder;
	}

	@Override
	public String toString() {
		return "FriendlyLink{" +
			", linkId=" + linkId +
			", linkName=" + linkName +
			", linkUrl=" + linkUrl +
			", linkLogo=" + linkLogo +
			", showOrder=" + showOrder +
			"}";
	}
}
