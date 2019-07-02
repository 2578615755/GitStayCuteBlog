package cn.huawei.staycuteblog.mapper;

import cn.huawei.staycuteblog.entity.ArticleSort;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

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
public interface ArticleSortMapper{

    /**
     * 查询分类信息
     * @return
     */
    List<ArticleSort> getAll();
}