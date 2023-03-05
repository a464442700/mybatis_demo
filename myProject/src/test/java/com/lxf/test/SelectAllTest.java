package com.lxf.test;

import com.lxf.mapper.StudentsMapper;
import com.lxf.pojo.Students;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SelectAllTest {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            StudentsMapper studentsMapper = sqlSession.getMapper(StudentsMapper.class);
            List<Students> students = studentsMapper.SelectStudentAll();
            System.out.println(students);
            sqlSession.close();
        } catch (IOException e) {
        }
    }
}
