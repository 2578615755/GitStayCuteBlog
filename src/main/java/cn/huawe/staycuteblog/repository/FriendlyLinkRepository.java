package cn.huawe.staycuteblog.repository;

import cn.huawe.staycuteblog.entity.EmailMessage;
import cn.huawe.staycuteblog.entity.FriendlyLink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendlyLinkRepository extends JpaRepository<FriendlyLink,Integer> {

}