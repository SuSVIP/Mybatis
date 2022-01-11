package com.zzl.mapper;

import com.zzl.pojo.User;

import java.util.List;

public interface UserMapper {
    //查询所有
     List<User> findAll();

     //根据id查询
    User findById(int id);

    //增加一个用户
    Integer addUser(User user);

    //修改用户
    Integer updateUser(User user);

    //删除用户
    Integer deleteUser(int id);

}
