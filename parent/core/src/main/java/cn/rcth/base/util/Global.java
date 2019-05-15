package cn.rcth.base.util;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 微信平台一些固定参数
 */
@Data
public class Global {

    // 小程序唯一标识 (在微信小程序管理后台获取)
    public static final String appId = "wx0b4ebf0c70ca4803";
    // 小程序的 app secret (在微信小程序管理后台获取)
    public static final String secret = "6abaaac120f81e812165bff51bfa4065";
    // 授权（必填）
    public static final String grant_type = "authorization_code";
    //请求地址
    public static final String requestUrl="https://api.weixin.qq.com/sns/jscode2session";

    public String getAppId(){
        return appId;
    }
    public String getSecret(){
        return secret;
    }
    public String getGrant_type(){
        return grant_type;
    }
    public String getRequestUrl(){
        return requestUrl;
    }
}
