package com.qf.dao;

import com.qf.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 54110 on 2020/4/20.
 */
public interface UserRespostroy extends JpaRepository<User,Integer> {
}
