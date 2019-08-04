package com.gujun.basic;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

/**
 * @ClassName gu
 * @Description TODO
 * @Author GuJun
 * @Date 2019/8/4 17:15
 * @Version 1.0
 **/
public class Test01 {

    //Mybatis的核心组件：
    //SqlSessionFactoryBuilder，会根据配置或代码来生成SqlSessionFactory，采用的分步构建的Builder模式；
    //SqlSessionFactory，工厂接口，依靠它来生成SqlSession,工厂模式；
    //SqlSession,会话，一个既可以发送sql执行返回结果，也可以获取Mapper的接口；
    //Sql Mapper，映射器，由Java接口和xml配置文件组成，需给出sql和映射规则；

    //即可以通过xml，也可以通过Java代码来生成SqlSessionFactory；
    //每个基于MyBatis的应用都是以一个SqlSessionFactory实例为中心的，
    //SqlSessionFactory的作用就是产生MyBatis的核心接口对象SqlSession;
    //所以SqlSessionFactory往往采用单例模式；

//    @Test
//    public void test01(){
//        SqlSessionFactoryBuilder
//    }

}
