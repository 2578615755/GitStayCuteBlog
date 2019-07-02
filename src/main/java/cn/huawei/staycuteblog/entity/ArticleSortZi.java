package cn.huawei.staycuteblog.entity;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@TableName("article_sort_zi")
@Data
@ToString
public class ArticleSortZi implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 子类ID
   */
  @TableId(value="sortZi_article_id", type= IdType.AUTO)
  private Integer ziId;
  /**
   * 子类名称
   */
  @TableField("sortZi_article_name")
  private String ziName;
  /**
   * 分类id
   */
  @TableField("sortZi_sort_article_id")
  private Integer sortId;
  /**
   * 帖子分类子类
   */
  @TableField("article_sort")
  private ArticleSort articleSort;
}
