package cn.huawei.staycuteblog.controller;

import cn.huawei.staycuteblog.entity.User;
import cn.huawei.staycuteblog.service.UserService;
import cn.huawei.staycuteblog.utils.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

/**
* @program: StayCuteBlog
*
* @description: 管理员控制台
*
* @author: huangmindong
*
* @create: 2019-07-04 11:08
**/
@Controller
@RequestMapping("/admin")
public class AdminContrroller {

    @Autowired
    private UserService userService;

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("/selectAll")
    @ResponseBody
    public List<User> selectAll(){
        return userService.selectAll();
    }

    /**
     * 按照ID删除用户
     * @param id
     * @return
     */
    @RequestMapping("/deleteUserById")
    @ResponseBody
    public String deleteUserById(Integer id){
        if(userService.deleteUserById(id)>0){
            return "删除成功";
        }else {
            return "未知错误";
        }
    }
    @RequestMapping("/adminInsertUser")
    @ResponseBody
    public String adminInsertUser(String username,String email,String sex,String userPower,String userFreeze){
        String qq=email.substring(0,10);
        String qqtitle="http://q1.qlogo.cn/g?b=qq&nk="+qq+"&s=140";
        if(userService.adminInsertUser(username,username,email,sex,userPower,userFreeze,qq,qqtitle, Time.getTime())>0){
            return "添加成功";
        }else {
            return "未知错误";
        }
    }
}
