package com.wangsuhang.service.impl;

import com.wangsuhang.dao.StudentDao;
import com.wangsuhang.domain.Student;
import com.wangsuhang.service.StudentService;

import java.util.List;

/**
 * @author suahng
 * @date 2020-11-07 20:31
 * @dec
 */
public class StudentServiceImpl implements StudentService {

    //引用类型
    private StudentDao studentDao;

    //使用set注入，赋值
    public void setStudentDao(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> queryStudents() {
        List<Student> students = studentDao.selectStudents();
        return students;
    }
}
