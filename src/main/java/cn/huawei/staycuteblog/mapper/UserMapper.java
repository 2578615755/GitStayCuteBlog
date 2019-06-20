package cn.huawei.staycuteblog.mapper;

import cn.huawei.staycuteblog.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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
}