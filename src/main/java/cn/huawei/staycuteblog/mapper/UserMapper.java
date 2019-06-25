package cn.huawei.staycuteblog.mapper;

import cn.huawei.staycuteblog.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-18
 */
@Mapper
public interface UserMapper{
    /**
     * Shiro登录 并且得到数据
     * @param username
     * @return
     */
    @Select("select * from user where user_name=#{username}")
    User getByUsername(String username);

    /**
     * 通过用户名查询用户的头像
     * @param username
     * @return
     */
    @Select("select user_image_url from user where user_name=#{username}")
    String getByTitle(String username);

    /**
     * 手机注册用户
     * @param username
     * @param password
     * @param phone
     * @param qq
     * @param email
     * @param title
     * @param ip
     * @return
     */
    @Insert("insert into user (user_name, user_pwd, user_phone, user_qq, user_email,user_image_url,user_register_ip) " +
            "values (#{username},#{password},#{phone},#{qq},#{email},#{title},#{ip});")
    int sjRegistered(String username,String password,String phone,String qq,
                   String email,String title,String ip);

    /**
     * 修改登录之后的IP
     * @param username
     * @param ip
     * @return
     */
    @Update("update user set user_last_login_ip = #{ip} where user_name=#{username};")
    int updateLoginIp(String username,String ip);
}