package com.quellan.zlflovemm.dao.mapper1;

import org.apache.ibatis.annotations.Select;

/**
 * @ClassName CronMapper
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2019/9/26 14:26
 * @Version 1.0
 */
public interface CronMapper {

    @Select("select cron from scheduled where cron_id = #{id}")
    public String getCron(int id);
}
