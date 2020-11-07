package com.wangsuhang.dao;

import com.wangsuhang.domain.Student;

import java.util.List;

/**
 * @author suahng
 * @date 2020-11-07 20:04
 * @dec
 */
public interface StudentDao {

    int insertStudent(Student student);
    List<Student> selectStudents();

}
