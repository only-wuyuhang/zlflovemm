package com.quellan.zlflovemm.autotask;

import com.quellan.zlflovemm.dao.mapper1.CronMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;

/**
 * @ClassName AutoTaskFromDB
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2019/9/26 14:24
 * @Version 1.0
 */
/*

@Slf4j
@Component
public class AutoTaskFromDB implements SchedulingConfigurer {

    @Autowired
    protected CronMapper cronMapper;

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {

        scheduledTaskRegistrar.addTriggerTask(() -> process(),
                triggerContext -> {
                    String cron = cronMapper.getCron(1);
                    if (cron.isEmpty()) {
                       log.info("cron 为空");
                    }
                    return new CronTrigger(cron).nextExecutionTime(triggerContext);
                }
        );
    }

    private  void process(){
        log.info("formDB ");
    }
}
*/
