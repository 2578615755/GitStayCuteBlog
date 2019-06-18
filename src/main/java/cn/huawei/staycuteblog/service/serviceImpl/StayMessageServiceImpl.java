package cn.huawei.staycuteblog.service.serviceImpl;

import cn.huawei.staycuteblog.entity.StayMessage;
import cn.huawei.staycuteblog.mapper.StayMessageMapper;
import cn.huawei.staycuteblog.service.StayMessageService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-18
 */
@Service
public class StayMessageServiceImpl extends ServiceImpl<StayMessageMapper, StayMessage> implements StayMessageService {
	
}
