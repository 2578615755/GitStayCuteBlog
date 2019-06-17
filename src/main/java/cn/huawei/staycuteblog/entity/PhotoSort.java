package cn.huawei.staycuteblog.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@ToString
@Entity
public class PhotoSort {
    /**
    * 相册ID
    */
    @Id
    @GeneratedValue
    private Integer sortImgId;

    /**
    * 相册名
    */
    private String sortImgName;

    /**
    * 展示方式 0->仅主人可见,1->输入密码即可查看,2->仅好友能查看,3->回答问题即可查看
    */
    private String sortImgType;

    /**
    * 查看密码
    */
    private String imgPassword;

    /**
    * 所属用户ID
    */
    private Integer userId;

    /**
    * 访问问题
    */
    private String imgSortQuestion;

    /**
    * 访问问题的答案
    */
    private String imgSortAnswer;

    /**
    * 默认1表示相册板块
    */
    private Integer typeId;

    /**
    * 封面图片的路径
    */
    private Integer topPicSrc;
}