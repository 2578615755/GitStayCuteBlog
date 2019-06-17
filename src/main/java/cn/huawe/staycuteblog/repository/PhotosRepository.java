package cn.huawe.staycuteblog.repository;

import cn.huawe.staycuteblog.entity.PhotoSort;
import cn.huawe.staycuteblog.entity.Photos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotosRepository extends JpaRepository<Photos,Integer> {

}