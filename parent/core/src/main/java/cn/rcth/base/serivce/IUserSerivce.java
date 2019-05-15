package cn.rcth.base.serivce;

import cn.rcth.base.domain.User;

public interface IUserSerivce {

    /**
     * 查询数据库是否存在当前用户
      * @param openId 当前用户id
     * @return
     */
    User getopenId(String openId);

    /**
     * 将用户默认数据存入数据库
     * @param user 用户数据
     */
    void inUser(User user);
}
