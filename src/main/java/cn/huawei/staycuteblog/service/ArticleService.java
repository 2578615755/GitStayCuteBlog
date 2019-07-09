package cn.huawei.staycuteblog.service;

import cn.huawei.staycuteblog.entity.Article;
import com.baomidou.mybatisplus.service.IService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-18
 */
@Service
public interface ArticleService{
    public List<Article> selectAtrcle();
	
}
