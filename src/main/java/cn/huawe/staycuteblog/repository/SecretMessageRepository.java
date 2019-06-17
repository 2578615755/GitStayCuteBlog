package cn.huawe.staycuteblog.repository;

import cn.huawe.staycuteblog.entity.ProblemSort;
import cn.huawe.staycuteblog.entity.SecretMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecretMessageRepository extends JpaRepository<SecretMessage,Integer> {

}