package cn.huawe.staycuteblog.repository;

import cn.huawe.staycuteblog.entity.Friend;
import cn.huawe.staycuteblog.entity.FriendlyLink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friend,Integer> {

}