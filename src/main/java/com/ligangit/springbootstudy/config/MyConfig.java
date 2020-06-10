package com.ligangit.springbootstudy.config;/*
 * @BelongsProject:spring-boot-study
 * @BelongsPackage:com.ligangit.springbootstudy.config
 * @Author:com.ligangit.springbootstudy.config
 * @CreateTime:2020-01-18 ${HORU}:07
 * @Descriptation:todo*/

import com.ligangit.springbootstudy.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  @Configuration：指明当前类是一个配置类；就是来代替之前的Spring配置
 *
 *  在配置文件中用<bean></bean>标签添加组件
*/
@Configuration
public class MyConfig {

    //将方法的返回值添加到容器中；容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean给容器中添加组件了。。。。");
        return new HelloService();
    }
}