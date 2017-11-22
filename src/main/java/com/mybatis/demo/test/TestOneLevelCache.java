package com.mybatis.demo.test;

import com.mybatis.demo.MyBatisUtil;
import com.mybatis.demo.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

public class TestOneLevelCache {

    @Test
    public void testCache1(){
        SqlSession session = MyBatisUtil.getSqlSession();
        String statement = "com.mybatis.demo.mapping.userMapper.getUser";
        User user = session.selectOne(statement,1);
        System.out.println(user);

        user = session.selectOne(statement,1);
        System.out.println(user);
        session.close();

        session = MyBatisUtil.getSqlSession();
        user = session.selectOne(statement,1);
        System.out.println(user);

        user = session.selectOne(statement,2);
        System.out.println(user);

        user = session.selectOne(statement,2);
        System.out.println(user);
    }
}
