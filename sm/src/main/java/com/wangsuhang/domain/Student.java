package com.wangsuhang.domain;

/**
 * @author suahng
 * @date 2020-11-07 19:56
 * @dec
 */
public class Student {

    private String name;
    private Integer id;
    private String email;
    private Integer age;

    public Student() {
    }

    public Student(String name, Integer id, String email, Integer age) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
