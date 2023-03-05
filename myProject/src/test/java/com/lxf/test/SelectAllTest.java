package com.lxf.test;

import com.lxf.mapper.StudentsMapper;
import com.lxf.pojo.Students;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SelectAllTest {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        Students s= new Students(1,null);
        Map studentsMap=new HashMap();
        studentsMap.put("studentId",1);

        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            StudentsMapper studentsMapper = sqlSession.getMapper(StudentsMapper.class);
          //  List<Students> students = studentsMapper.SelectStudentAllById(1);
            //List<Students> students = studentsMapper.SelectStudentAllById(s);
            List<Students> students = studentsMapper.SelectStudentAllById(studentsMap);
            System.out.println(students);
            sqlSession.close();
        } catch (IOException e) {
        }
    }
}
