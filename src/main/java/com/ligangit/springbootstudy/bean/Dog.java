package com.ligangit.springbootstudy.bean;/*
 * @BelongsProject:spring-boot-study
 * @BelongsPackage:com.ligangit.springbootstudy.bean
 * @Author:com.ligangit.springbootstudy.bean
 * @CreateTime:2020-01-14 ${HORU}:52
 * @Descriptation:todo*/

public class Dog {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
