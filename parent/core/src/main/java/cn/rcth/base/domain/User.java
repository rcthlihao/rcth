package cn.rcth.base.domain;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class User {
    private Integer id;

    private String openId;

    private String sessionKey;

    private String unionId;

    private Integer errCode;

    private String errMsg;


}