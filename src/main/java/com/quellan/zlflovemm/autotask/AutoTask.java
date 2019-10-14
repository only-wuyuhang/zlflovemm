package com.quellan.zlflovemm.autotask;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @ClassName AutoTask
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2019/9/23 16:42
 * @Version 1.0
 */
@Component
@Slf4j
public class AutoTask {

    //@Scheduled(cron="*/6 * * * * ?")
    private void process(){
        log.info("autoTask ");
    }

    /*@Scheduled(fixedRate = 6000)*/
    private void process2(){
        log.info("222 ");
    }
}
