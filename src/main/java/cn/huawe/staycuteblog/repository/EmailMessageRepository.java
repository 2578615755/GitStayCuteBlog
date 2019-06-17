package cn.huawe.staycuteblog.repository;

import cn.huawe.staycuteblog.entity.ArticleSort;
import cn.huawe.staycuteblog.entity.EmailMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailMessageRepository extends JpaRepository<EmailMessage,Integer> {

}