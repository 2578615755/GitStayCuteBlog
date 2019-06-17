package cn.huawei.staycuteblog.service.impl;

import cn.huawei.staycuteblog.entity.User;
import cn.huawei.staycuteblog.repository.UserRepository;
import cn.huawei.staycuteblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务逻辑
 * @author H丶丢心先生
 * @date 2019-05-11 13:54:36
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    User registered(User user){
        return userRepository.save(user);
    }
}
