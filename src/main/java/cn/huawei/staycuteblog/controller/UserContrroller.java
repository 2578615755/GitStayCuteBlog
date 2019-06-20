package cn.huawei.staycuteblog.controller;


import cn.huawei.staycuteblog.entity.User;
import cn.huawei.staycuteblog.service.UserService;
import cn.huawei.staycuteblog.utils.Msg;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-18
 */
@Controller
@RequestMapping("/user")
public class UserContrroller {

    @Autowired
    private UserService userService;

    @RequestMapping("/homepage")
    public String homepage(){
        return "homepage";
    }
    @RequestMapping("/loginpage")
    public String loginpage(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session,String username, String password){
        //1.获取Subject
        Subject subject = SecurityUtils.getSubject();
        //2.封装用户数据
        UsernamePasswordToken token=new UsernamePasswordToken(username,password);
        ///3.执行登录方法
        try {
            subject.login(token);
            //登陆成功
            User user = userService.login(username);
            session.setAttribute("user",user);
            return "redirect:/user/homepage";
        } catch (UnknownAccountException e) {
            session.setAttribute("msg","您的用户名不存在");
            return "redirect:/user/loginpage";
        }catch (IncorrectCredentialsException e) {
            session.setAttribute("msg","您的密码填写有误");
            return "redirect:/user/loginpage";
        }
    }
    @ResponseBody
    @RequestMapping("/findTitle")
    public String findTitle(String username){
        return userService.findTitle(username);
    }
}
