package com.zzl.mybatis01;

import java.sql.*;

public class OnlyJdbc {
    public static void main(String[] args) throws Exception{
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try{
            //加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //通过驱动管理类获取数据库链接
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306//sa/eesy?characterEncoding=utf-8","sa","jk200326");
            //定义 sql 语句 ?表示占位符
            String sql="select * from user where username=?";
            //获取预处理 statement
            preparedStatement=connection.prepareStatement(sql);
            //设置参数，第一个参数为 sql 语句中参数的序号（从 1 开始），第二个参数为设置的
            preparedStatement.setString(1,"王五");
            //向数据库发出 sql 执行查询，查询出结果集
            resultSet=preparedStatement.executeQuery();
            //遍历查询结果集
            while (resultSet.next()){
                System.out.println(resultSet.getString("id")+resultSet.getString("username"));
            }

        }catch(Exception exception){
            exception.printStackTrace();
        }finally{
            //释放资源。先开后关
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
    }

}
