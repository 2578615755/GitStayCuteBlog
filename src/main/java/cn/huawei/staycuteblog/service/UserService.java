package cn.huawei.staycuteblog.service;

import cn.huawei.staycuteblog.entity.User;
import com.baomidou.mybatisplus.service.IService;
import org.apache.ibatis.annotations.Select;

import java.util.List;

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

    /**
     * 查询用户是否被注册
     * @param username
     * @return
     */
    User selectPhoneTrue(String username);
    /**
     * 重置密码
     * @param username
     * @param password
     * @return
     */
    int updatePassword(String username,String password);

    /**
     * 通过同户名查询用户信息
     * @param username
     * @return
     */
    User selectUser(String username,String password);
    /**
     * 查询所有用户
     * @return
     */
    List<User> selectAll();
    /**
     * 按照ID删除用户
     * @param id
     * @return
     */
    int deleteUserById(Integer id);
}
