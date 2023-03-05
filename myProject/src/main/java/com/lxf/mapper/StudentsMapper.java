package com.lxf.mapper;

import com.lxf.pojo.Students;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentsMapper {
    List<Students> selectStudentsid();

    Students selectStudentid(int studentID);

    List<Students> SelectStudentAll(int id);

    List<Students> SelectStudentAllById(@Param("studentId") int id);
    List<Students> SelectStudentAllById(Students students);

    List<Students> SelectStudentAllById(Map studentsMap);

}
