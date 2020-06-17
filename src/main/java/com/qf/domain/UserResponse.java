package com.qf.domain;

import lombok.Data;

import java.util.List;

/**
 * Created by 54110 on 2020/4/21.
 */
@Data
public class UserResponse {

    private Long total;

    private List<User> User;
}
