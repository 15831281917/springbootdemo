package com.rjq.springbootdemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rjq.springbootdemo.entity.User;

public interface UserService {
    /**
     * 分页查询所有用户
     * @param page
     * @return
     */
    IPage<User> listUser(IPage<String> page);
}
