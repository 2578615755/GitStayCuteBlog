package cn.huawei.staycuteblog.controller;


import cn.huawei.staycuteblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-18
 */
@Controller
@RequestMapping("/article")
public class ArticleContrroller {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/deleteArticle")
    @ResponseBody
    public String deleteArticle(Integer id){
        if (articleService.deleteArtcle(id)>0){
            return "删除成功!";
        }else{
            return "未知错误!";
        }
    }

    @RequestMapping("/article")
    public String article(){
        return "article";
    }
	
}
