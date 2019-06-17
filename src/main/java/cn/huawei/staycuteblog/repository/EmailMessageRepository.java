package cn.huawei.staycuteblog.repository;

import cn.huawei.staycuteblog.entity.EmailMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailMessageRepository extends JpaRepository<EmailMessage,Integer> {

}