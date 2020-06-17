package com.qf.service.impl;

import com.qf.AnnotationTest;
import com.qf.dao.UserRespostroy;
import com.qf.domain.User;
import com.qf.domain.UserResponse;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by 54110 on 2020/4/20.
 */
@Service // @Component
public class UserServiceImpl implements UserService {

    @Autowired
    UserRespostroy userRespostroy;

    @Override
    public UserResponse findAll(Integer page,Integer size) {

        PageRequest pageRequest = new PageRequest(page, size);
        Page<User> all = userRespostroy.findAll(pageRequest);
        //数据得总数
        long totalElements = all.getTotalElements();
        List<User> content = all.getContent();

        UserResponse urs = new UserResponse();
        urs.setTotal(totalElements);
        urs.setUser(content);

        return urs;
    }

    @Override
    public User finByID(Integer id) {
        Optional<User> byId = userRespostroy.findById(id);
        return byId.get();
    }

    @Override

    public String update(User user) {
        user.getUsername();
        User user1 = userRespostroy.saveAndFlush(user);

        if (user1!=null) {
            return "success";
        }else {
            return "fail";
        }

    }
}
