package cn.huawei.staycuteblog.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@ToString
@Entity
public class Photos {
    /**
    * 相片ID
    */
    @Id
    @GeneratedValue
    private Integer photoId;

    /**
    * 相片名称
    */
    private String photoName;

    /**
    * 图片路径
    */
    private String photoSrc;

    /**
    * 图片描述
    */
    private String photoDescription;

    /**
    * 所属用户ID
    */
    private Integer userId;

    /**
    * 所属相册ID
    */
    private Integer sortId;

    /**
    * 图片上传时间
    */
    private String uploadTime;

    /**
    * 图片操作上传IP地址
    */
    private String uploadIp;
}