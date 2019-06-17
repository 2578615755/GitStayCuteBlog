package cn.huawe.staycuteblog.repository;

import cn.huawe.staycuteblog.entity.StayMessage;
import cn.huawe.staycuteblog.entity.SystemMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemMessageRepository extends JpaRepository<SystemMessage,Integer> {

}