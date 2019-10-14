package com.quellan.zlflovemm.service;

/**
 * @ClassName mailService
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2019/10/7 19:13
 * @Version 1.0
 */
public interface MailService {
    boolean sendSimpleMail(String mailTo);

    boolean sendMail(String mailTo);
}
