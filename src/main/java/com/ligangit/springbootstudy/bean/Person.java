package com.ligangit.springbootstudy.bean;/*
 * @BelongsProject:spring-boot-study
 * @BelongsPackage:com.ligangit.springbootstudy.bean
 * @Author:com.ligangit.springbootstudy.bean
 * @CreateTime:2020-01-14 ${HORU}:50
 * @Descriptation:todo*/

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;


/* 将配置文件中配置的每一个属性的值，映射到组件中
*   @ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定
*       prefix = "person" ：配置文件中哪个下面的所有属性进行一一映射
*    只有这个组件是容器中的组件，才能还用容器@ConfigurationProperties提供的功能
*    @ConfigurationProperties(prefix = "person")默认从全局配置文件中获取
* */
//@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
//@Validated //添加数据校验
public class Person {
//    @Email //lastName必须是邮箱格式 （@ConfigurationProperties才支持）
//    @Value("${person.last-name}")
//    @Value("${person.lastName}") //（不支持-n替换为N）
    private String lastName;
//    @Value("#{11*2}")
    private Integer age;
//    @Value("true")
    private Boolean boss;
    private Date birth;
//    @Value("${person.maps}") //复杂类型封装（不支持）
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
