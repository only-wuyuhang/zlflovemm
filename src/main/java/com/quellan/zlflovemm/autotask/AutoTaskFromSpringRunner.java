package com.quellan.zlflovemm.autotask;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName AutoTaskFromSpringRunner
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2019/9/26 15:55
 * @Version 1.0
 */
@Slf4j
@Component
public class AutoTaskFromSpringRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        process();
        /*new Thread(() -> {
            while (true) {
                process2();
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    log.error("{}",e);
                }
            }
        }).start();*/
    }

    private void process(){
        log.info(" run ApplicationArguments");
    }
    private void process2(){
        log.info("线程定时器");
    }
}
