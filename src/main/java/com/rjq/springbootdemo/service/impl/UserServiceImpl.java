package com.rjq.springbootdemo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rjq.springbootdemo.entity.User;
import com.rjq.springbootdemo.mapper.UserMapper;
import com.rjq.springbootdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public IPage<User> listUser(IPage<String> page) {
        return userMapper.listUser(page);
    }
}
