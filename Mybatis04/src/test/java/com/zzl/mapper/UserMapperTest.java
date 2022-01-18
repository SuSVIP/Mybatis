package com.zzl.mapper;

import com.zzl.pojo.User;
import com.zzl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    //查询所有
    @Test
    public void findAll(){
        // 获得sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try{
            // 1.执行 getmapper
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userDao.findAll();
            for (User user : userList) {
                System.out.println(user);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            //关闭
            sqlSession.close();
        }
    }

    //根据id查询
    @Test
    public void findById(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        try{
            UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
            User user=userMapper.findById(1);
            System.out.println(user);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    //增加一个用户
    @Test
    public  void addUUser(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        userMapper.addUser(new User(4,"haha","123"));

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void update(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        userMapper.update(new User(4,"hahe","1234"));

        sqlSession.commit();
        sqlSession.commit();
    }

    //删除用户
    @Test
    public void delete(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        userMapper.delete(4);

        sqlSession.commit();
        sqlSession.close();
    }

}
