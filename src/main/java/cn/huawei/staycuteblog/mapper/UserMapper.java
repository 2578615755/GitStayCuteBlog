package cn.huawei.staycuteblog.mapper;

import cn.huawei.staycuteblog.entity.User;
import org.apache.ibatis.annotations.*;

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

    /**
     * 查询用户是否被注册
     * @param username
     * @return
     */
    @Select("select * from user where user_name=#{username}")
    User selectPhoneTrue(String username);

    /**
     * 重置密码
     * @param username
     * @param password
     * @return
     */
    @Update("update user set user_pwd=#{password}  where user_name=#{username} ;")
    int updatePassword(String username,String password);

    /**
     * 后台登录查询用户信息
     * @param username
     * @param password
     * @return
     */
    @Select("select * from user where user_name=#{username} and user_pwd=#{password}")
    User selectUser(String username,String password);

    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from user;")
    List<User> selectAll();

    /**
     * 按照ID删除用户
     * @param id
     * @return
     */
    @Delete("DELETE FROM user WHERE user_id = #{id}")
    int deleteUserById(Integer id);

    /**
     * 管理员添加用户
     * @param username
     * @param email
     * @param sex
     * @param userPower
     * @param userFreeze
     * @return
     */
    @Insert("insert into user (user_name,user_pwd,user_email,user_sex,user_power,user_freeze,user_qq,user_image_url,user_register_time) " +
            "values (#{username},#{pwd},#{email},#{sex},#{userPower},#{userFreeze},#{qq},#{qqtitle},#{time});")
    int adminInsertUser(String username,String pwd,String email,String sex,String userPower,String userFreeze,String qq,String qqtitle,String time);
}