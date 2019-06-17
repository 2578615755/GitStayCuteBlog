package cn.huawei.staycuteblog.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-17
 */
@Controller
@RequestMapping("/user")
public class UserContrroller {
    //牛逼kkkkkkls
    @RequestMapping("/hello")
    @ResponseBody
	public String hello(){
	    return "hello";
    }
}
