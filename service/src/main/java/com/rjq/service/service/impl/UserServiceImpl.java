package com.rjq.service.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rjq.service.entity.User;
import com.rjq.service.mapper.UserMapper;
import com.rjq.service.service.UserService;
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
