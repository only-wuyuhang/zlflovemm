package com.quellan.zlflovemm.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @ClassName MyBatisConfigOne
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2019/9/21 15:13
 * @Version 1.0
 */
@Configuration
@MapperScan(basePackages = "com.quellan.zlflovemm.dao.mapper1",sqlSessionFactoryRef = "sqlSessionFactory1",sqlSessionTemplateRef = "sqlSessionTemplate1")
public class MyBatisConfigOne {
    @Resource(name = "dbOne")
    DataSource dbOne;

    @Bean
    @Primary
    SqlSessionFactory sqlSessionFactory1()throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dbOne);
        return bean.getObject();
    }
    @Bean
    @Primary
    SqlSessionTemplate sqlSessionTemplate1() throws Exception{
        return new SqlSessionTemplate(sqlSessionFactory1());
    }
}