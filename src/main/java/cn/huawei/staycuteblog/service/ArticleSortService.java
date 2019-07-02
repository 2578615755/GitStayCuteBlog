package cn.huawei.staycuteblog.service;

import cn.huawei.staycuteblog.entity.ArticleSort;
import cn.huawei.staycuteblog.entity.ArticleSortZi;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-18
 */
public interface ArticleSortService{
    /**
     * 查询子类分类信息
     * @return
     */
    List<ArticleSort> getAll();

    /**
     * 查询分类信息
     * @return
     */
    List<ArticleSortZi> getAllZi();
}
