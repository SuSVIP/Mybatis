package com.zzl.dao;

import com.zzl.domain.User;
import com.zzl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test() {
        //1.获取SqlSession对象
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        //2.执行sql
        IUserDao iUserDao = sqlSession.getMapper(IUserDao.class);
        List<User> userList=iUserDao.getUserList();

        for (User user:userList){
            System.out.println(user);
        }

        //关闭
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlsession=MybatisUtils.getSqlSession();

        IUserDao iUserDao=sqlsession.getMapper(IUserDao.class);
        User user= iUserDao.getUserById(1);
        System.out.println(user);

        sqlsession.close();
    }
}
