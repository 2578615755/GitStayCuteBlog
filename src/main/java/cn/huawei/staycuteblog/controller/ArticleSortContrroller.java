package cn.huawei.staycuteblog.controller;


import cn.huawei.staycuteblog.entity.ArticleSort;
import cn.huawei.staycuteblog.entity.ArticleSortZi;
import cn.huawei.staycuteblog.service.ArticleSortService;
import com.sun.javafx.collections.MappingChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-18
 */
@Controller
@RequestMapping("/articleSort")
public class ArticleSortContrroller {

    @Autowired
    private ArticleSortService articleSortService;

    @RequestMapping("/getAll")
    @ResponseBody
	public Map<String,Object> getAllList(){
        List<ArticleSort> list = articleSortService.getAll();
        Map<String,Object> map=new HashMap<>();
        map.put("status",100);
        map.put("msg","处理成功");
        map.put("list",list);
        return map;
    }

    @RequestMapping("/getZi")
    @ResponseBody
    public Map<String,Object> getAllZi(){
        List<ArticleSort> ziList = articleSortService.getAllZi();
        Map<String,Object> map=new HashMap<>();
        map.put("status",100);
        map.put("msg","处理成功");
        map.put("list",ziList);
        return map;
    }
}
