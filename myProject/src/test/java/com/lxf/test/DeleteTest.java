package com.lxf.test;

import com.lxf.mapper.StudentsMapper;
import com.lxf.pojo.Students;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class DeleteTest {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);
        ids.add(5);
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            StudentsMapper studentsMapper = sqlSession.getMapper(StudentsMapper.class);

            studentsMapper.DeleteStudents(ids);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
        }
    }
}

