package cn.huawei.staycuteblog.mapper;

import cn.huawei.staycuteblog.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
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
public interface UserMapper extends BaseMapper<User> {
    /**
     * 登录 并且得到数据
     * @param username
     * @param password
     * @return
     */
    @Select("select * from user where user_name=#{username} and user_pwd=#{password} ")
    User getByUsernameAndPassword(String username,String password);
}