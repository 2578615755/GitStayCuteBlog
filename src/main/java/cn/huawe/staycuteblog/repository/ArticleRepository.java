package cn.huawe.staycuteblog.repository;

import cn.huawe.staycuteblog.entity.Ad;
import cn.huawe.staycuteblog.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Integer> {

}