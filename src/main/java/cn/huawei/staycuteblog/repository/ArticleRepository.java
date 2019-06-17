package cn.huawei.staycuteblog.repository;

import cn.huawei.staycuteblog.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Integer> {

}