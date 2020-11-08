package com.wangsuhang;

import com.wangsuhang.dao.StudentDao;
import com.wangsuhang.domain.Student;
import com.wangsuhang.service.StudentService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author suahng
 * @date 2020-11-08 10:47
 * @dec
 */
public class MyTest {

    @Test
    public void test01(){

        String config = "applicationContext.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("容器中对象名称" + name);
        }
    }


    @Test
    public void test02(){

        String config = "applicationContext.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);

        StudentDao dao = (StudentDao) context.getBean("studentDao");
        Student student = new Student();
        student.setId(1009);
        student.setAge(25);
        student.setName("周瑜");
        student.setEmail("zhouyu@163.com");
        int nums = dao.insertStudent(student);
        System.out.println("nums=" + nums);
    }

    @Test
    public void test03(){

        String config = "applicationContext.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);

        StudentService studentService = (StudentService) context.getBean("studentService");
        Student student = new Student("张飞",1008,"zhangfei@qq.com",33);
        int nums = studentService.addStudent(student);
        System.out.println("nums=" + nums);
    }
}

