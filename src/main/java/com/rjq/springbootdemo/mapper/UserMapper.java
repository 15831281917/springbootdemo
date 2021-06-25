package com.rjq.springbootdemo.mapper;



import com.rjq.springbootdemo.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserMapper {

    @Select("select * from we_user")
    List<User> findAll();
}
