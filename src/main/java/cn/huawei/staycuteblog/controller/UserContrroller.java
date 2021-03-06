package cn.huawei.staycuteblog.controller;


import cn.huawei.staycuteblog.entity.User;
import cn.huawei.staycuteblog.mapper.UserMapper;
import cn.huawei.staycuteblog.service.UserService;
import cn.huawei.staycuteblog.utils.IpUtil;
import cn.huawei.staycuteblog.utils.Msg;
import cn.huawei.staycuteblog.utils.ReSetSmsUtil;
import cn.huawei.staycuteblog.utils.SmsUtil;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Random;
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
    private final String POWER="管理员";
    @Autowired
    private UserService userService;
    @Autowired
    private HttpServletRequest request;


    @RequestMapping("/homepage")
    public String homepage(){
        return "homepage";
    }
    @RequestMapping("/loginpage")
    public String loginpage(){
        return "login";
    }
    @RequestMapping("/registeredpage")
    public String registered(){
        return "registered";
    }
    @RequestMapping("/resetpasswordPage")
    public String resetpasswordPage(){
        return "resetpassword";
    }
    @RequestMapping("/dataPage")
    public String dataPage(){
        return "data";
    }
    @RequestMapping("/adminLoginPage")
    public String adminLoginPage(){
        return "adminLogin";
    }
    @RequestMapping("/noAuthPage")
    public String noAuthPage(){
        return "noAuth";
    }
    /**
     * 登录
     * @param session
     * @param username
     * @param password
     * @return
     */
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
            //获得IP
            String ip = IpUtil.getIP(request);
            //修改最后一次登录的IP地址
            userService.updateLoginIp(username,ip);
            String information=IpUtil.ipxinx(ip);
            //将ip地址以及省市地址返回到首页
            session.setAttribute("information",information);
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
    /**
     * 手机号码注册
     * @param session
     * @param username
     * @param password
     * @param qq
     * @return
     */
    @RequestMapping("/sjRegistered")
    public String sjRegistered(HttpSession session,String username, String password,String qq){
        //获得IP
        String ip = IpUtil.getIP(request);
        if(userService.sjRegistered(username,password,username,qq,qq+"@qq.com","http://q1.qlogo.cn/g?b=qq&nk="+qq+"&s=140",ip)>0){
            session.setAttribute("msg","注册成功,正在跳转至登录页!");
            return "redirect:/user/loginpage";
        }else {
            session.setAttribute("msg","发生未知错误,请尝试重新注册!");
            return "redirect:/user/registeredpage";
        }
    }

    /**
     * 重置密码
     * @param phone
     * @param password
     * @return
     */
    @RequestMapping("/updatePassword")
    public String updatePassword(HttpSession session,String phone,String password){
        if(userService.updatePassword(phone, password)>0){
            session.setAttribute("msg","重置密码成功,正在跳转至登录页!");
            return "redirect:/user/loginpage";
        }else {
            session.setAttribute("msg","发生未知错误,请稍后再尝试!");
            return "redirect:/user/resetpasswordPage";
        }
    }













    /**
     * 注册账号时发送手机验证码 以及返回验证码
     * @param phone
     * @return
     * @throws Exception
     */
    @GetMapping("/sendPhone")
    @ResponseBody
    public synchronized String sendPhone(String phone)throws Exception{
        //生成验证码
        Random random=new Random();
        Integer result = random.nextInt(900000) + 100000;
        //发送验证码
        SendSmsResponse response = SmsUtil.sendSms(phone,String.valueOf(result));
        //将验证码返回到ajax
        return String.valueOf(result);
    }
    /**
     * 重置密码账号时发送手机验证码 以及返回验证码
     * @param phone
     * @return
     * @throws Exception
     */
    @GetMapping("/reSetSendPhone")
    @ResponseBody
    public synchronized String reSetSendPhone(String phone)throws Exception{
        //生成验证码
        Random random=new Random();
        Integer result = random.nextInt(900000) + 100000;
        //发送验证码
        SendSmsResponse response = ReSetSmsUtil.sendSms(phone,String.valueOf(result));
        //将验证码返回到ajax
        return String.valueOf(result);
    }

    /**
     * 通过用户名查询用户头像
     * @param username
     * @return
     */
    @ResponseBody
    @RequestMapping("/findTitle")
    public String findTitle(String username){
        return userService.findTitle(username);
    }

    /**
     * 查询用户是否被占用
     * @param phone
     * @return
     */
    @RequestMapping("/selectPhoneTrue")
    @ResponseBody
    public String selectPhoneTrue(String phone){
        if(userService.selectPhoneTrue(phone)!=null){
            return "true";
        }else {
            return "false";
        }
    }
    @RequestMapping("/selectUser")
    public String selectUser(HttpSession session, String username, String password){
        //1.获取Subject
        Subject subject = SecurityUtils.getSubject();
        //2.封装用户数据
        UsernamePasswordToken token=new UsernamePasswordToken(username,password);
        ///3.执行登录方法
        try {
            subject.login(token);
            //登陆成功
            User user = userService.login(username);
            if(user.getUserPower().equals(POWER)){
                session.setAttribute("user",user);
                return "redirect:/admin/index.html";
            }else {
                return "redirect:/user/noAuthPage";
            }
        } catch (UnknownAccountException e) {
            session.setAttribute("msg","您的用户名不存在");
            return "redirect:/adminLogin.html";
        }catch (IncorrectCredentialsException e) {
            session.setAttribute("msg","您的密码填写有误");
            return "redirect:/adminLogin.html";
        }catch (Exception e) {
            session.setAttribute("msg", "发生未知错误,请联系管理员");
            return "redirect:/adminLogin.html";
        }
    }
}
