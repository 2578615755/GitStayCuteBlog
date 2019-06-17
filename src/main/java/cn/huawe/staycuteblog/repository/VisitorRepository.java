package cn.huawe.staycuteblog.repository;

import cn.huawe.staycuteblog.entity.User;
import cn.huawe.staycuteblog.entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository extends JpaRepository<Visitor,Integer> {

}