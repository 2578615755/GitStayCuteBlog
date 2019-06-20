package cn.huawei.staycuteblog.config;

import cn.huawei.staycuteblog.entity.User;
import cn.huawei.staycuteblog.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
* @program: blog
*
* @description: 自定义Realm
*
* @author: huangmindong
*
* @create: 2019-05-21 17:19
**/
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    /**
     * 授权逻辑
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        //给资源进行授权
//        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
//        //info.addStringPermission("user:1");
//        //获取当前登录的用户
//        Subject subject= SecurityUtils.getSubject();
//        User user = (User) subject.getPrincipal();
//        User byId = userService.selectById(user.getUserId());
//        info.addStringPermission(byId.getUserPermission().toString());
        return null;
    }

    /**
     * 执行认证逻辑
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //编写Shiro判断逻辑,判断用户名和密码
        UsernamePasswordToken token=(UsernamePasswordToken)authenticationToken;
        User user = userService.login(token.getUsername());
        if(user==null){
            return null;
        }
        return new SimpleAuthenticationInfo(user,user.getUserPwd(),"");
    }
}
