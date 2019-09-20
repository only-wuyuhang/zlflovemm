package com.quellan.zlflovemm.service;

import com.quellan.zlflovemm.entry.UserEntry;

import java.util.List;

public interface UserService {

    List<UserEntry> findUserList();

    int addUser(String userName,String password,String email);

    int deleteUser(int id);
}
