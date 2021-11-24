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
    @Value("${xxl.job.admin.addresses}")
    private String adminAddresses;

    @Value("${xxl.job.executor.appName}")
    private String appName;

    @Value("${xxl.job.executor.ip:}")
    private String ip;

    @Value("${xxl.job.executor.port}")
    private int port;

    @Value("${xxl.job.executor.accessToken:}")
    private String accessToken;

    @Value("${xxl.job.executor.logPath}")
    private String logPath;

    @Value("${xxl.job.executor.logRetentionDays}")
    private int logRetentionDays;

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

    @Test
    void jobTest() {
        System.out.println(adminAddresses);
        System.out.println(appName);
        System.out.println(ip);
        System.out.println(port);
        System.out.println(accessToken);
        System.out.println(logPath);
        System.out.println(logRetentionDays);
    }
}