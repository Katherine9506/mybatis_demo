package com.mybatis.demo.test;

import com.mybatis.demo.domain.Scholar;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatiesTest {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
//        Reader reader = Resources.getResourceAsReader(resource);
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        InputStream is = MybatiesTest.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sessionFactory.openSession();

        String statement = "com.mybatis.demo.mapping.scholarMapper.getScholar";
        Scholar scholar = session.selectOne(statement, 1191392);
        System.out.println(scholar);
    }
}
