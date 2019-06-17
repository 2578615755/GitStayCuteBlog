package cn.huawe.staycuteblog.repository;

import cn.huawe.staycuteblog.entity.UserComment;
import cn.huawe.staycuteblog.entity.UserProblem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProblemRepository extends JpaRepository<UserProblem,Integer> {

}