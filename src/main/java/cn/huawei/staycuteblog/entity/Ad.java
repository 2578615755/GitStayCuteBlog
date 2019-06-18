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
@TableName("ad")
public class Ad implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     */
	@TableId(value="ad_id", type= IdType.AUTO)
	private Integer adId;
    /**
     * 0,站外广告;从1开始代表的是该广告所处的广告位,同表ad_postition中的字段position_id的值
     */
	@TableField("position_id")
	private Integer positionId;
    /**
     * 广告类型,0图片;1flash;2代码3文字
     */
	@TableField("media_type")
	private Integer mediaType;
    /**
     * 该条广告记录的广告名称
     */
	@TableField("ad_name")
	private String adName;
    /**
     * 广告链接地址
     */
	@TableField("ad_link")
	private String adLink;
    /**
     * 广告链接的表现,文字广告就是文字或图片和flash就是它们的地址
     */
	@TableField("ad_code")
	private String adCode;
    /**
     * 广告开始时间
     */
	@TableField("start_time")
	private Date startTime;
    /**
     * 广告结束时间
     */
	@TableField("end_time")
	private Date endTime;
    /**
     * 广告联系人
     */
	@TableField("link_man")
	private String linkMan;
    /**
     * 广告联系人的邮箱
     */
	@TableField("link_email")
	private String linkEmail;
    /**
     * 广告联系人得电话
     */
	@TableField("link_phone")
	private String linkPhone;
    /**
     * 广告点击次数
     */
	@TableField("click_count")
	private Integer clickCount;
    /**
     * 该广告是否关闭;1开启; 0关闭; 关闭后广告将不再有效
     */
	private Integer enabled;


	public Integer getAdId() {
		return adId;
	}

	public void setAdId(Integer adId) {
		this.adId = adId;
	}

	public Integer getPositionId() {
		return positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public Integer getMediaType() {
		return mediaType;
	}

	public void setMediaType(Integer mediaType) {
		this.mediaType = mediaType;
	}

	public String getAdName() {
		return adName;
	}

	public void setAdName(String adName) {
		this.adName = adName;
	}

	public String getAdLink() {
		return adLink;
	}

	public void setAdLink(String adLink) {
		this.adLink = adLink;
	}

	public String getAdCode() {
		return adCode;
	}

	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getLinkMan() {
		return linkMan;
	}

	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}

	public String getLinkEmail() {
		return linkEmail;
	}

	public void setLinkEmail(String linkEmail) {
		this.linkEmail = linkEmail;
	}

	public String getLinkPhone() {
		return linkPhone;
	}

	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}

	public Integer getClickCount() {
		return clickCount;
	}

	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "Ad{" +
			", adId=" + adId +
			", positionId=" + positionId +
			", mediaType=" + mediaType +
			", adName=" + adName +
			", adLink=" + adLink +
			", adCode=" + adCode +
			", startTime=" + startTime +
			", endTime=" + endTime +
			", linkMan=" + linkMan +
			", linkEmail=" + linkEmail +
			", linkPhone=" + linkPhone +
			", clickCount=" + clickCount +
			", enabled=" + enabled +
			"}";
	}
}
