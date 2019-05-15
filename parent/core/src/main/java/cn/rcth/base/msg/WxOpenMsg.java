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
    //开放平台唯一id
    private String unionId;
    //错误码
    private Integer errCode;
    //错误信息
    private String errMsg;
}
