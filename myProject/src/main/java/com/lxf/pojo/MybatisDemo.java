package com.lxf.pojo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisDemo {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        System.out.println(sqlSession);//这一步成功表示成功连接数据库并新建一个会话
        List<Students> students= sqlSession.selectList("test.selectStudentsid");//在此会话中执行SQL语句
        System.out.println(students);
        sqlSession.close();
    }
}
