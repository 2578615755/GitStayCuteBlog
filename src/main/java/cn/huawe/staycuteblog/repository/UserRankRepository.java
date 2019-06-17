package cn.huawe.staycuteblog.repository;

import cn.huawe.staycuteblog.entity.UserProblem;
import cn.huawe.staycuteblog.entity.UserRank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRankRepository extends JpaRepository<UserRank,Integer> {

}