

package com.lxf.test;

        import com.lxf.mapper.StudentsMapper;
        import com.lxf.pojo.Students;
        import org.apache.ibatis.io.Resources;
        import org.apache.ibatis.session.SqlSession;
        import org.apache.ibatis.session.SqlSessionFactory;
        import org.apache.ibatis.session.SqlSessionFactoryBuilder;
        import java.io.IOException;
        import java.io.InputStream;


public class UpdateTest {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        Students s= new Students();
        s.setstudentId(1);
        s.setStudent_name("a");
        s.setClass_name("1班");
        s.setSex("man");
        s.setAge(11);
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            StudentsMapper studentsMapper = sqlSession.getMapper(StudentsMapper.class);

            studentsMapper.UpdateOneStudent(s);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
        }
    }
}

