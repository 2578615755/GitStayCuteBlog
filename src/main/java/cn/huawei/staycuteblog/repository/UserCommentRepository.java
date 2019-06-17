package cn.huawei.staycuteblog.repository;

import cn.huawei.staycuteblog.entity.UserComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCommentRepository extends JpaRepository<UserComment,Integer> {

}