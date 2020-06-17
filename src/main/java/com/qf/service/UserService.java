package com.qf.service;

import com.qf.domain.User;
import com.qf.domain.UserResponse;

/**
 * Created by 54110 on 2020/4/20.
 */
public interface UserService {

    UserResponse findAll(Integer page, Integer size);

    User finByID(Integer id);

    String update(User user);
}
