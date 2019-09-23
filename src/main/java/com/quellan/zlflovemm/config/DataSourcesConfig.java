package com.quellan.zlflovemm.config;

import org.apache.ibatis.annotations.Param;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.Map;

/**
 * @ClassName DataSourcesConfig
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2019/9/20 17:31
 * @Version 1.0
 */

@Configuration
public class DataSourcesConfig {

    @Bean(name="dbOne")
    @ConfigurationProperties(prefix = "spring.datasource.one")
    @Primary
    DataSource dbOne(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name="dbTwo")
    @ConfigurationProperties(prefix = "spring.datasource.two")
    DataSource dbTwo(){
        return DataSourceBuilder.create().build();
    }

}
