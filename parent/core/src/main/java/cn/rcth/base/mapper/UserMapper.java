package cn.rcth.base.mapper;

import cn.rcth.base.domain.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    //通过openId 查询当前用户是否存在
    User selectOpenId(String openId);



}