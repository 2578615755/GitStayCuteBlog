package cn.huawei.staycuteblog.repository;

import cn.huawei.staycuteblog.entity.SecretMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecretMessageRepository extends JpaRepository<SecretMessage,Integer> {

}