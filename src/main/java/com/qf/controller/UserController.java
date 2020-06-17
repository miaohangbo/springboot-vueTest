package com.qf.controller;

import com.qf.domain.User;
import com.qf.domain.UserResponse;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 54110 on 2020/4/20.
 */
@Controller //controller+responsBody
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/findAll/{page}/{size}")
    @ResponseBody
    public UserResponse findAll(@PathVariable("page")Integer page, @PathVariable("size")Integer size){
        return userService.findAll(page,size);
    }

    @RequestMapping("/index")
    public String index(){
        return "UserList";
    }

    @RequestMapping("/findById/{id}")
    @ResponseBody
    public User findByID(@PathVariable("id")Integer id){
        return userService.finByID(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(@RequestBody User user){

        return userService.update(user);
    }


}
