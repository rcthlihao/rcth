package cn.rcth.controller;

import cn.rcth.base.domain.User;
import cn.rcth.base.msg.ResultMsg;
import cn.rcth.base.msg.WxOpenMsg;
import cn.rcth.base.serivce.IUserSerivce;
import cn.rcth.base.serivce.impl.SessionOrOpenId;
import cn.rcth.base.serivce.impl.UserSerivceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 微信登录

     * @Description: 解密用户敏感数据
     * @param encryptedData 明文,加密数据
 * @param iv   加密算法的初始向量
 * @param code  用户允许登录后，回调内容会带上 code（有效期五分钟），开发者需要将 code 发送到开发者服务器后台，使用code 换取 session_key api，将 code 换成 openid 和 session_key
 * @return*/
@Controller
public class LoginController {

     @Autowired
     private SessionOrOpenId sessionOrOpenId;

     @Autowired
     private IUserSerivce userSerivce;

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @RequestMapping(value = "/decodeUserInfo", method = RequestMethod.POST)
    @ResponseBody
    public Map decodeUserInfo(String encryptedData, String iv, String code) {

        Map map = new HashMap();
        // 登录凭证不能为空
        if (code == null || code.length() == 0) {
            map.put("status", 0);
            map.put("msg", "code 不能为空");
            return map;
        }
        WxOpenMsg openMsg = sessionOrOpenId.getSessionOrOpenId(code);
        //判断当前用户是否存在
        User user = userSerivce.getopenId(openMsg.getOpenId());
        if (user == null){
            //用户不存在,存入初始数据
            user.setOpenId(openMsg.getOpenId());
            user.setSessionKey(openMsg.getSessionKey());
            user.setUnionId(openMsg.getUnionId());
            user.setErrCode(openMsg.getErrCode());
            user.setErrMsg(openMsg.getErrMsg());
            //将默认信息存入数据库
            userSerivce.inUser(user);
        }
        map.put("userInfo",openMsg);
        System.out.println(map);
        return map;
    }
}
