package cn.huawe.staycuteblog.repository;

import cn.huawe.staycuteblog.entity.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepository extends JpaRepository<Ad,Integer> {
}