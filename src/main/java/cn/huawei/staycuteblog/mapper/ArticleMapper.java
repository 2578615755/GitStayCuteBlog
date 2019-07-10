package cn.huawei.staycuteblog.mapper;

import cn.huawei.staycuteblog.entity.Article;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-18
 */
@Mapper
public interface ArticleMapper{
    /**
     * 查询所有帖子
     * @return
     */
    List<Article> selectArticle();

    /**
     * 单个删除帖子
     */
    @Delete("delete from article where article_id=#{id}")
    int deleteArticle(@Param("id") Integer id);
}