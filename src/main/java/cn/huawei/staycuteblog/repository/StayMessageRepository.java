package cn.huawei.staycuteblog.repository;

import cn.huawei.staycuteblog.entity.StayMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StayMessageRepository extends JpaRepository<StayMessage,Integer> {

}