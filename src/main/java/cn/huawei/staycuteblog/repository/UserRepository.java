package cn.huawei.staycuteblog.repository;

import cn.huawei.staycuteblog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}