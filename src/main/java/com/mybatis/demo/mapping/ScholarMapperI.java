package com.mybatis.demo.mapping;

import com.mybatis.demo.domain.Scholar;
import org.apache.ibatis.annotations.Select;

/**
 * 定义sql映射的接口，使用注解指明方法要执行的SQL
 */
public interface ScholarMapperI {
    @Select("select * from scholar where id=#{id}")
    public Scholar getById(int id);
}
