package com.rjq.springbootdemo.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rjq.springbootdemo.entity.User;
import com.rjq.springbootdemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/aaa")
    public String listUser() {

        // 分页参数
        IPage<String> page = new Page<>();
        page.setCurrent(1);
        page.setSize(1);
        IPage<User> listUser = userService.listUser(page);
        System.out.println(JSON.toJSON(listUser));
        return null;
    }
}