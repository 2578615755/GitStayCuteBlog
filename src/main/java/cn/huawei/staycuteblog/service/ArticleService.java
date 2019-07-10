package cn.huawei.staycuteblog.service;

import cn.huawei.staycuteblog.entity.Article;
import com.baomidou.mybatisplus.service.IService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-18
 */
public interface ArticleService{
    /**
     * 查询所有帖子
     * @return
     */
    List<Article> selectAtrcle();

    /**
     * 单个删除帖子
     * @return
     */
    int deleteArtcle(@RequestParam("id") Integer id);
	
}
