package com.zzl.mapper;

import com.zzl.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询所有
    @Select("select * from user")
    List<User> findAll();

    //根据id查询
    @Select("select * from user where useid=#{useid}")
    User findById(int id);

    //增加一个用户
    @Insert("insert into user(useid,usename,password) values(#{useid},#{usename},#{password})")
    Integer  addUser(User user);

    //修改用户:update user set usename = #{usename},password=#{password} where useid=#{useid}
    @Update("update user set usename=#{usename},password=#{password} where useid=#{useid}")
   Integer update(User user);

    //删除用户:delete from user where useid=#{useid};
    @Delete("delete from user where useid=#{useid}")
    Integer delete(int id);


}
