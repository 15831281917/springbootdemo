package com.rjq.springbootdemo.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rjq.springbootdemo.entity.User;
import com.rjq.springbootdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    void listUser() {
        // 分页参数
        IPage<String> page = new Page<>();
        page.setCurrent(1);
        page.setSize(1);
        IPage<User> listUser = userService.listUser(page);
        System.out.println(JSON.toJSONString(listUser));
    }
}