package cn.huawei.staycuteblog.controller;


import cn.huawei.staycuteblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-18
 */
@Controller
@RequestMapping("/ad")
public class AdContrroller {
    @Autowired
    private UserService userService;
    @Autowired
    private HttpServletRequest request;

	@RequestMapping("/ad")
    public String ad(){
	    return "ad.html";
    }

    @RequestMapping("/adLease")
    public String adLease(){
	    return "adLease.html";
    }
}
