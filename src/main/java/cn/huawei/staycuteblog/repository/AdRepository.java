package cn.huawei.staycuteblog.repository;

import cn.huawei.staycuteblog.entity.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepository extends JpaRepository<Ad,Integer> {
}