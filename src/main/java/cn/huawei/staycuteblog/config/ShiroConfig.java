package cn.huawei.staycuteblog.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
* @program: blog
*
* @description: Shiro的配置类
*
* @author: huangmindong
*
* @create: 2019-05-21 17:17
**/
@Configuration
public class ShiroConfig {
    /**
     * 创建ShiroFilterFactoryBean
     */
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager")DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();

        //设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //添加Shiro内置过滤器
        /**
         * 实现权限的拦截
         *  常用的过滤器:
         *      anon: 无需登录可以访问
         *      authc:必须登录才能访问
         *      user:如果使用rememberMe的功能可以直接访问
         *      perms:该资源必须得到资源权限才能访问
         *      role:该资源必须得到角色权限才能访问
         */
        Map<String,String> filterMap=new LinkedHashMap<>();
        //拦截所有帖子
        filterMap.put("/post/**","authc");
        //拦截管理员对用户的操作
        filterMap.put("/admin/user/**","perms[1]");
        //拦截直播页面
        filterMap.put("/show","perms[1]");
        //拦截普通对自己用户修改
        filterMap.put("/user/updateUser","authc");
        //修改跳转的登录页面
        shiroFilterFactoryBean.setLoginUrl("/login");
        //设置未授权提示页面
        shiroFilterFactoryBean.setUnauthorizedUrl("/noAuth");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
        return shiroFilterFactoryBean;
    }
    /**
     * 创建DefaultWebSecurityManager
     */
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
        //关联realm
        securityManager.setRealm(userRealm);
        return securityManager;
    }
    /**
     * 创建Realm
     */
    @Bean(name = "userRealm")
    public UserRealm getRealm(){
        return new UserRealm();
    }
}
