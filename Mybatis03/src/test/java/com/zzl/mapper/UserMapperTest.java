package com.zzl.mapper;

import com.zzl.pojo.User;
import com.zzl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    //查询所有
    @Test
    public void findAll() {
        //1.获取SqlSession对象
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        //2.执行sql
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList=userMapper.findAll();

        for (User user:userList){
            System.out.println(user);
        }

        //关闭
        sqlSession.close();
    }

    //根据id查询
    @Test
    public void findById(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        User user=userMapper.findById(1);
        System.out.println(user);

        sqlSession.close();
    }

    //增加一个用户
    @Test
    public void addUser(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        userMapper.addUser(new User(4,"haha","123"));

        //增删改要提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    //修改一个用户
    @Test
    public void updateUser(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        userMapper.updateUser(new User(4,"hahe","1231"));

        //增删改要提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    //删除一个用户
    @Test
    public void deleteUser(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        userMapper.deleteUser(4);

        //增删改要提交事务
        sqlSession.commit();
        sqlSession.close();
    }
}
