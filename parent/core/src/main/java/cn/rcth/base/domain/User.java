package cn.rcth.base.domain;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class User extends BatisDomain {

    private String openId;

    private String sessionKey;



}