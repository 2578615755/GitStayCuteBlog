package cn.huawei.staycuteblog.repository;

import cn.huawei.staycuteblog.entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository extends JpaRepository<Visitor,Integer> {

}