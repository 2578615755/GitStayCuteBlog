package cn.huawe.staycuteblog.repository;

import cn.huawe.staycuteblog.entity.User;
import cn.huawe.staycuteblog.entity.UserRank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}