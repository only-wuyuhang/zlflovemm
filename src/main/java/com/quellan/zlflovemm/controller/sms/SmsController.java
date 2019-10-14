package com.quellan.zlflovemm.controller.sms;

import com.quellan.zlflovemm.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName SmsController
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2019/10/14 10:44
 * @Version 1.0
 */
@RestController
@RequestMapping("/sms")
public class SmsController {

    @Autowired
    private SmsService smsService;

    @RequestMapping(value = "/send",method = RequestMethod.GET)
    public String sendSms(@RequestParam(value = "userName")String userName){
        smsService.sendSms(userName);
        return "success";
    }
}
