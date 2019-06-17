package cn.huawe.staycuteblog.repository;

import cn.huawe.staycuteblog.entity.SystemMessage;
import cn.huawe.staycuteblog.entity.UserComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCommentRepository extends JpaRepository<UserComment,Integer> {

}