package cn.huawei.staycuteblog.service.serviceImpl;

import cn.huawei.staycuteblog.entity.EmailMessage;
import cn.huawei.staycuteblog.mapper.EmailMessageMapper;
import cn.huawei.staycuteblog.service.EmailMessageService;
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
public class EmailMessageServiceImpl extends ServiceImpl<EmailMessageMapper, EmailMessage> implements EmailMessageService {
	
}
