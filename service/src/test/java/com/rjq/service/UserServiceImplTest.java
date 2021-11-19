package com.rjq.service;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rjq.service.entity.User;
import com.rjq.service.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserServiceImplTest {

    @Value("${aaa}")
    String password;

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

    @Test
    void getPassword() {
        System.out.println(password);
    }
}