package com.rjq.service.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rjq.service.entity.User;

public interface UserService {
    /**
     * 分页查询所有用户
     * @param page
     * @return
     */
    IPage<User> listUser(IPage<String> page);
}
