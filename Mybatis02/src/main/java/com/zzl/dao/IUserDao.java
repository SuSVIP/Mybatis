package com.zzl.dao;

import com.zzl.domain.User;

import java.util.List;
//dao等价于mapper。后续将会为mapper而不是dao。这里是为了方便理解。
public interface IUserDao {
     //查询所有
     List<User> getUserList() ;

     //根据id查询
     User getUserById(int id);

}
