package cn.rcth.base.serivce.impl;

import cn.rcth.base.domain.User;
import cn.rcth.base.mapper.UserMapper;
import cn.rcth.base.serivce.IUserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserSerivceImpl implements IUserSerivce {

    @Autowired
    private UserMapper userMapper;

    @Override//查询用户是否存在
    public User getopenId(String openId) {
        User user = userMapper.selectOpenId(openId);
        return user;
    }

    @Override//存储用户信息
    public void inUser(User user) {
        userMapper.insert(user);
    }
}
