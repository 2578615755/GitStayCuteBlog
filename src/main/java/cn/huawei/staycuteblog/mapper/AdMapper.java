package cn.huawei.staycuteblog.mapper;

import cn.huawei.staycuteblog.entity.Ad;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Date;
import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-18
 */
@Mapper
public interface AdMapper{
    /**
     * @Description: 广告点击次数+1
     * @Param:  广告id
     * @return:  boolean
     * @Author: Liao Shengfu
     * @Date: 2019/7/6
     **/
    @Update("update ad set click_count = click_count+1")
    Boolean updateclick_count(int ad_id);

    /**
     * @Description: 查询广告
     * @Param:
     * @return: List<Ad>
     * @Author: Liao Shengfu
     * @Date: 2019/7/7
     **/
    @Select("select ad_id,ad_name,ad_link,ad_code from ad where enabled != 0")
    List<Ad> getAd();

    /**
     * @Description: 添加广告信息
     * @Param: mediatype,adname,adlink,adcode,starttime,endtime,linkman,linkemail,linkphone
     * @return: int
     * @Author: Liao Shengfu
     * @Date: 2019/7/7
     **/
    @Insert("insert into ad(media_type,ad_name,ad_link,ad_code,start_time,end_time,link_man,link_email,link_phone)"+
            "values (#{mediatype},#{adname},#{adlink},#{adcode},#{starttime},#{endtime},#{linkman},#{linkemail},#{linkphone})")
    int insertAd(int mediatype, String adname, String adlink, String adcode, String starttime,
                 String endtime,String linkman,String linkemail,String linkphone);
}