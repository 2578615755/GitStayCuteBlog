package cn.huawei.staycuteblog.service.serviceImpl;

import cn.huawei.staycuteblog.entity.Article;
import cn.huawei.staycuteblog.mapper.ArticleMapper;
import cn.huawei.staycuteblog.service.ArticleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-18
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
	
}
