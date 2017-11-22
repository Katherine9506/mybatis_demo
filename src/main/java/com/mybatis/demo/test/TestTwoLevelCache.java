package com.mybatis.demo.test;

import com.mybatis.demo.MyBatisUtil;
import com.mybatis.demo.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;

public class TestTwoLevelCache {

    @Test
    public void testCache2(){
        String statement = "com.mybatis.demo.mapping.userMapper.getUser";
        SqlSessionFactory factory = MyBatisUtil.getSqlSessionFactory();
        //开启两个不同的SqlSession
        SqlSession session1 = factory.openSession();
        SqlSession session2 = factory.openSession();
        //使用二级缓存时，User类必须实现一个Serializable接口===> User implements Serializable
        User user = session1.selectOne(statement, 1);
        session1.commit();//不懂为啥，这个地方一定要提交事务之后二级缓存才会起作用
        System.out.println("user="+user);

        //由于使用的是两个不同的SqlSession对象，所以即使查询条件相同，一级缓存也不会开启使用
        user = session2.selectOne(statement, 1);
        //session2.commit();
        System.out.println("user2="+user);
    }
}
