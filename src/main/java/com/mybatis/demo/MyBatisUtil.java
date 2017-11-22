package com.mybatis.demo;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisUtil {

    public static SqlSessionFactory getSqlSessionFactory() {
        String resource = "mybatis-config.xml";
        InputStream is = MyBatisUtil.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        return sessionFactory;
    }

    public static SqlSession getSqlSession() {
        return getSqlSessionFactory().openSession();
    }

    public static SqlSession getSqlSession(boolean isAutoCommit) {
        return getSqlSessionFactory().openSession(isAutoCommit);
    }
}
