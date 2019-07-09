package cn.huawei.staycuteblog.service.serviceImpl;

import cn.huawei.staycuteblog.entity.Ad;
import cn.huawei.staycuteblog.mapper.AdMapper;
import cn.huawei.staycuteblog.service.AdService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-18
 */
@Service
public class AdServiceImpl implements AdService {

    @Autowired
    private AdMapper adMapper;

    /**
     * @Description: 广告点击次数+1
     * @Param:  广告id
     * @return:  boolean
     * @Author: Liao Shengfu
     * @Date: 2019/7/6
     **/
    public Boolean updateclick_count(int ad_id) {
        return adMapper.updateclick_count(ad_id);
    }

    /**
     * @Description: 广告点击次数+1
     * @Param:  广告id
     * @return:  boolean
     * @Author: Liao Shengfu
     * @Date: 2019/7/6
     **/
    public List<Ad> getAd() {
        return null;
    }

    /**
     * @Description: 广告点击次数+1
     * @Param:  广告id
     * @return:  boolean
     * @Author: Liao Shengfu
     * @Date: 2019/7/6
     **/
    public int insertAd(int mediatype, String adname, String adlink, String adcode, Date starttime, Date endtime, String linkman, String linkemail, String linkphone) {
        return 0;
    }
}
