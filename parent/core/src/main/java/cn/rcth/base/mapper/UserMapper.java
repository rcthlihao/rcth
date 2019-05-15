package cn.rcth.base.mapper;

import cn.rcth.base.domain.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    /**
     * 查询数据库当前是否存在本用户
     * @param openId
     * @return
     */
    User selectOpenId(String openId);
}