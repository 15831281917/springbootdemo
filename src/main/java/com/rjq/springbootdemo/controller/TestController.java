package com.rjq.springbootdemo.controller;

import com.rjq.springbootdemo.entity.Student;
import com.rjq.springbootdemo.entity.User;
import com.rjq.springbootdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RefreshScope
public class TestController {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
    @Value("${aaa}")
    String aaa;
    @Resource
    private Student student;

    @Resource
    UserMapper userMapper;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello Spring Boot!";
    }

    @RequestMapping("/hello1")
    @ResponseBody
    public String hello1() {
        return "Hello Spring Boot!热部署成功！";
    }

    @RequestMapping("/hello2")
    @ResponseBody
    public String hello2() {
        System.out.println(aaa);
        return name + age;
    }

    @RequestMapping("/hello3")
    @ResponseBody
    public String hello3() {
        return student.getName() + student.getAge();
    }

    @RequestMapping("/listUser")
    public String listUser(Model model) {
        List<User> list = userMapper.findAll();
        model.addAttribute("list", list);
        return "listUser";
    }
}
