package com.rjq.springbootdemo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rjq.springbootdemo.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserMapper {

    @Select("select * from we_user")
    List<User> findAll();

    /**
     * 分页查询所有用户
     * @param page
     * @return
     */
    IPage<User> listUser(IPage<String> page);
}
