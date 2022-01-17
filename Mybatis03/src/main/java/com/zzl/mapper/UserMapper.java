package com.zzl.mapper;

import com.zzl.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //查询所有
     List<User> findAll();
     //根据id查询
    User findById(int id);
    //模糊查询
    List<User> findUserLike(String s);


    //增加一个用户
    Integer addUser(User user);
    //使用map的增加
    int addByMap(Map<String, Object> map);

    //修改用户
    Integer updateUser(User user);

    //删除用户
    Integer deleteUser(int id);


}
