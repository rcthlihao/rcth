package cn.rcth.base.serivce.impl;

import cn.rcth.base.msg.WxOpenMsg;
import cn.rcth.base.util.Global;
import cn.rcth.base.util.HttpRequest;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * 通过code 获取 openid  和   session_key
 */
@Service
public class SessionOrOpenId {

    /**
     * 发送请求
     * @param code 前端传来的用户数据
     * @return 封装对象
     */
    public WxOpenMsg getSessionOrOpenId(String code) {
        Global global = new Global();
        // 请求参数
        String params =
                "appid=" + global.getAppId() +
                "&secret=" + global.getSecret() +
                "&js_code=" + code +
                "&grant_type=" + global.getGrant_type();
        //发送请求读取调用微信https://api.weixin.qq.com/sns/jscode2session接口获取openid用户和session_key
        WxOpenMsg OpenMsg =null;
        try {
            // 发送请求
            String sr = HttpRequest.sendPost(global.getRequestUrl(), params);
            OpenMsg = com.alibaba.fastjson.JSON.parseObject(sr, WxOpenMsg.class);
            return OpenMsg;
        }catch (RuntimeException e){
            e.printStackTrace();;
        }
        return OpenMsg;

    }
}
