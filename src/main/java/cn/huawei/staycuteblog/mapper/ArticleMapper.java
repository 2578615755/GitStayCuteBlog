package cn.huawei.staycuteblog.mapper;

import cn.huawei.staycuteblog.entity.Article;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
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
    List<Article> selectArticle();
}