package cn.huawe.staycuteblog.repository;

import cn.huawe.staycuteblog.entity.Shuoshuo;
import cn.huawe.staycuteblog.entity.StayMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StayMessageRepository extends JpaRepository<StayMessage,Integer> {

}