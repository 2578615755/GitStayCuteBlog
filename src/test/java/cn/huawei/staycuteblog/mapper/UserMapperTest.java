package cn.huawei.staycuteblog.mapper;

import cn.huawei.staycuteblog.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void getByUsername() {
        User byUsername = userMapper.getByUsername("2578615755");
        System.out.println(byUsername);
    }
}