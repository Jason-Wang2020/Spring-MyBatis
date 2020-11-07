package com.wangsuhang.service;

import com.wangsuhang.domain.Student;

import java.util.List;

/**
 * @author suahng
 * @date 2020-11-07 20:29
 * @dec
 */
public interface StudentService {

    int addStudent(Student student);
    List<Student> queryStudents();
}
