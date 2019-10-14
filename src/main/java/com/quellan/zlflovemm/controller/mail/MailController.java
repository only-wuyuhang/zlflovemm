package com.quellan.zlflovemm.controller.mail;

import com.quellan.zlflovemm.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MailController
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2019/10/7 19:25
 * @Version 1.0
 */

@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private MailService mailService;


    @RequestMapping(value = "/send",method = RequestMethod.GET)
    public String sendMail(@RequestParam(value = "userName")String userName){
        //mailService.sendSimpleMail(userName);
        mailService.sendMail(userName);
        return "success";
    }
}
