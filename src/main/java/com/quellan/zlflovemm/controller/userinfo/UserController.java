package com.quellan.zlflovemm.controller.userinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserController
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2019/9/16 17:14
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @RequestMapping("/getUser")
    public List<Map<String, Object>> getUser(){
        String sql="select * from sys_user";
        return jdbcTemplate.queryForList(sql);
    }
}
