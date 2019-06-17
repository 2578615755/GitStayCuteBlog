package cn.huawe.staycuteblog.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@ToString
@Entity
public class Ad {
    /**
    * 自增ID
    */
    @Id
    @GeneratedValue
    private Integer adId;

    /**
    * 0,站外广告;从1开始代表的是该广告所处的广告位,同表ad_postition中的字段position_id的值
    */
    private Integer positionId;

    /**
    * 广告类型,0图片;1flash;2代码3文字
    */
    private Integer mediaType;

    /**
    * 该条广告记录的广告名称
    */
    private String adName;

    /**
    * 广告链接地址
    */
    private String adLink;

    /**
    * 广告链接的表现,文字广告就是文字或图片和flash就是它们的地址
    */
    private String adCode;

    /**
    * 广告开始时间
    */
    private String startTime;

    /**
    * 广告结束时间
    */
    private String endTime;

    /**
    * 广告联系人
    */
    private String linkMan;

    /**
    * 广告联系人的邮箱
    */
    private String linkEmail;

    /**
    * 广告联系人得电话
    */
    private String linkPhone;

    /**
    * 广告点击次数
    */
    private Integer clickCount;

    /**
    * 该广告是否关闭;1开启; 0关闭; 关闭后广告将不再有效
    */
    private Integer enabled;
}