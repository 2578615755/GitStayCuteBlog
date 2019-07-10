package cn.huawei.staycuteblog.service;

import cn.huawei.staycuteblog.entity.Ad;
import com.baomidou.mybatisplus.service.IService;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-18
 */
public interface AdService{
	/**
     * @Description: 广告点击次数+1
     * @Param:  广告id
     * @return:  boolean
     * @Author: Liao Shengfu
     * @Date: 2019/7/6
     **/
    Boolean updateclick_count(int ad_id);

    /**
     * @Description: 查询广告
     * @Param:
     * @return: List<Ad>
     * @Author: Liao Shengfu
     * @Date: 2019/7/7
     **/
    List<Ad> getAd();

    /**
     * @Description: 添加广告信息
     * @Param: mediatype,adname,adlink,adcode,starttime,endtime,linkman,linkemail,linkphone
     * @return: int
     * @Author: Liao Shengfu
     * @Date: 2019/7/7
     **/
    int insertAd(int mediatype, String adname, String adlink, String adcode, String starttime,
                 String endtime,String linkman,String linkemail,String linkphone);
}
