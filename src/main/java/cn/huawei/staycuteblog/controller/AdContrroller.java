package cn.huawei.staycuteblog.controller;


import cn.huawei.staycuteblog.entity.Ad;
import cn.huawei.staycuteblog.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

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
    private AdService adService;

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

    @RequestMapping("/insertLease")
    @ResponseBody
    public String insertLease(Integer mediatype,String adname, String adlink, String adcode, String starttime,
                              String endtime,String linkman,String linkemail,String linkphone){
	    if (adService.insertAd(mediatype,adname,adlink,adcode,starttime,endtime,linkman,linkemail,linkphone)>0) {
            System.out.println("haole");
            return "redirect:/ad/ad";
        } else{
	        return "redirect:/ad/adLease";
        }
    }

    @RequestMapping("/getLease")
    @ResponseBody
    public String getLease(Ad ad){
	    return "";
    }
}
