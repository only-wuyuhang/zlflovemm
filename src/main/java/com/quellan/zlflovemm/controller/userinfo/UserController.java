package com.quellan.zlflovemm.controller.userinfo;

import com.quellan.zlflovemm.entry.UserEntry;
import com.quellan.zlflovemm.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2019/9/16 17:14
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<UserEntry> findUserList(){
        return userService.findUserList();
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String addUser(@RequestParam(value = "userName")String uaserName,@RequestParam(value = "password")String password,@RequestParam(value = "email")String email){
        int falg=userService.addUser(uaserName,password,email);
        if(falg>0){
            return "success";
        }
        return "error";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String deleteUser(@RequestParam(value = "id")int id){
        if(userService.deleteUser(id)>0){
            return "success";
        }
        return "error";
    }


    @RequestMapping(value = "/list2",method = RequestMethod.GET)
    public List<UserEntry> findUserList2(){
        return userService.findUserList2();
    }

    @RequestMapping(value = "/add2",method = RequestMethod.GET)
    public String addUser2(@RequestParam(value = "userName")String uaserName,@RequestParam(value = "password")String password,@RequestParam(value = "email")String email){
        int falg= userService.addUser2(uaserName,password,email);
        if(falg>0){
            return "success";
        }
        return "error";
    }

    @RequestMapping(value = "/delete2",method = RequestMethod.GET)
    public String deleteUser2(@RequestParam(value = "id")int id){
        if(userService.deleteUser2(id)>0){
            return "success";
        }
        return "error";
    }



}
