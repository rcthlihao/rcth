package cn.rcth.base.msg;

import lombok.Data;

/**
 * 微信登录返回对象
 */
@Data
public class WxOpenMsg {

    //微信openId
    private String openId;
    //会话秘钥
    private String sessionKey;

}
