package cn.huawei.staycuteblog.utils;

import lombok.Data;
import lombok.ToString;

import java.util.Map;

/**
* @program: StayCuteBlog
*
* @description: 返回数据的帮助类
*
* @author: huangmindong
*
* @create: 2019-06-19 09:55
**/
@ToString
@Data
public class Msg {
    /**
     * 状态码 1:失败 0:成功
     */
    private Integer code;
    /**
     * 返回的信息
     */
    private String msg;
    /**
     * 返回的数据
     */
    private Object data;

    /**
     * 成功
     * @param msg
     * @param data
     * @return
     */
    public static Msg succes(String msg,Object data){
        Msg msg1=new Msg();
        msg1.setCode(0);
        msg1.setMsg(msg);
        msg1.setData(data);
        return msg1;
    }

    /**
     * 失败
     * @param msg
     * @return
     */
    public static Msg shibai(String msg){
        Msg msg1=new Msg();
        msg1.setCode(1);
        msg1.setData(msg);
        return msg1;
    }
}
