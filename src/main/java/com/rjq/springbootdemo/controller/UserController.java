package com.rjq.springbootdemo.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rjq.springbootdemo.entity.User;
import com.rjq.springbootdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    public final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    UserService userService;

    @RequestMapping("/aaa")
    public String listUser() {

        // 分页参数
        IPage<String> page = new Page<>();
        page.setCurrent(1);
        page.setSize(1);
        IPage<User> listUser = userService.listUser(page);
        logger.info("数据库查询结果为：{}",JSON.toJSON(listUser));
        return null;
    }
}
