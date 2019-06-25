package cn.huawei.staycuteblog.service;

import cn.huawei.staycuteblog.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-18
 */
public interface UserService{
    /**
     * Shiro登录 得到数据
     * @param username
     * @return
     */
	User login(String username);

    /**
     * 通过用户名查询用户头像
     * @param username
     * @return
     */
	String findTitle(String username);

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
    int sjRegistered(String username,String password,String phone,String qq,
                     String email,String title,String ip);

    /**
     * 修改登录之后的IP
     * @param username
     * @param ip
     * @return
     */
    int updateLoginIp(String username,String ip);
}
