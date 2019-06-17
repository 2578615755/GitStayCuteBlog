package cn.huawe.staycuteblog.repository;

import cn.huawe.staycuteblog.entity.Article;
import cn.huawe.staycuteblog.entity.ArticleSort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleSortRepository extends JpaRepository<ArticleSort,Integer> {

}