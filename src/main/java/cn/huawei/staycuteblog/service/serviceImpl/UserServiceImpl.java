package cn.huawei.staycuteblog.service.serviceImpl;

import cn.huawei.staycuteblog.entity.User;
import cn.huawei.staycuteblog.mapper.UserMapper;
import cn.huawei.staycuteblog.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 登陆
     * @param username
     * @return
     */
    @Override
    public User login(String username) {
        return userMapper.getByUsername(username);
    }

    /**
     * 通过用户名查询用户头像
     * @param username
     * @return
     */
    @Override
    public String findTitle(String username) {
        return userMapper.getByTitle(username);
    }
    /**
     * 手机用户注册
     * @param username
     * @param password
     * @param phone
     * @param qq
     * @param email
     * @param title
     * @return
     */
    @Override
    public int sjRegistered(String username, String password, String phone, String qq, String email, String title,String ip) {
        return userMapper.sjRegistered(username,password,phone,qq,email,title,ip);
    }
    /**
     * 修改登录之后的IP
     * @param username
     * @param ip
     * @return
     */
    @Override
    public int updateLoginIp(String username, String ip) {
        return userMapper.updateLoginIp(username,ip);
    }
    /**
     * 查询用户是否被注册
     * @param username
     * @return
     */
    @Override
    public User selectPhoneTrue(String username) {
        return userMapper.selectPhoneTrue(username);
    }
}
