package com.qf.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by 54110 on 2020/4/20.
 */
@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private Integer age;

    private String address;
}
