package cn.huawei.staycuteblog.service.serviceImpl;

import cn.huawei.staycuteblog.entity.ArticleSort;
import cn.huawei.staycuteblog.entity.ArticleSortZi;
import cn.huawei.staycuteblog.mapper.ArticleSortMapper;
import cn.huawei.staycuteblog.service.ArticleSortService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-18
 */
@Service
public class ArticleSortServiceImpl implements ArticleSortService {

    @Autowired
    private ArticleSortMapper articleSortMapper;

    /**
     * 查询子类分类信息
     * @return
     */
    @Override
    public List<ArticleSort> getAll() {
        return articleSortMapper.getAll();
    }

    /**
     * 查询分类信息
     * @return
     */
    @Override
    public List<ArticleSort> getAllZi() {
        return articleSortMapper.getAllZi();
    }
}
