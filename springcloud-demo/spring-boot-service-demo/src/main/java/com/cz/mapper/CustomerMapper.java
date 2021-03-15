package com.cz.mapper;

import com.cz.entity.CustomerLogin;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author : zhang.cao
 * @date : 2021/3/15 14:51
 */
@Mapper
public interface CustomerMapper {
    @Select("SELECT * FROM customer_login")
    @Results({
            @Result(property = "customerId", column = "customer_id"),
            @Result(property = "loginName", column = "login_name"),
            @Result(property = "password", column = "password")
    })
    List<CustomerLogin> getAll();

    @Insert("INSERT INTO users(login_name,password) VALUES(#{loginName}, #{password})")
    void insert(CustomerLogin user);
}
