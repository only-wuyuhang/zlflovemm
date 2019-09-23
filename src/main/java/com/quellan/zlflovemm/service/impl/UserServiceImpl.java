package com.quellan.zlflovemm.service.impl;

import com.quellan.zlflovemm.dao.mapper1.UserMapper;
import com.quellan.zlflovemm.dao.mapper2.UserMapper2;
import com.quellan.zlflovemm.entry.UserEntry;
import com.quellan.zlflovemm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServiceImpl1
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2019/9/21 15:56
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    protected UserMapper userMapper;

    @Autowired
    protected UserMapper2 userMapper2;


    @Override
    public List<UserEntry> findUserList() {
        return userMapper.findUserList();
    }

    @Override
    public int addUser(String userName, String password, String email) {
        UserEntry user=new UserEntry();
        user.setUserName(userName);
        user.setPassword(password);
        user.setEmail(email);
        return userMapper.add(user);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.delete(id);
    }

    @Override
    public List<UserEntry> findUserList2() {
        return userMapper2.findUserList();
    }

    @Override
    public int addUser2(String userName, String password, String email) {
        UserEntry user=new UserEntry();
        user.setUserName(userName);
        user.setPassword(password);
        user.setEmail(email);
        return userMapper2.add(user);
    }

    @Override
    public int deleteUser2(int id) {
        return userMapper2.delete(id);
    }
}
