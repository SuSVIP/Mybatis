package com.zzl.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {

    private  static SqlSessionFactory sqlSessionFactory;
    static {
        //使用Mybatis获取sqlSessionFactory对象
        try {
            String resource="mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            //System.out.println("z");
           // System.out.println(sqlSessionFactory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取sqlSesion的实例
    //SqlSession完全包含了面向数据库执行sql命令所需的所有方法
    public static SqlSession getSqlSession(){
        //System.out.println("s");
        //System.out.println(sqlSessionFactory);
        return sqlSessionFactory.openSession();
    }
}
