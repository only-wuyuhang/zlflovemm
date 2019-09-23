package com.quellan.zlflovemm.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @ClassName MyBatisConfigTwo
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2019/9/21 15:13
 * @Version 1.0
 */
@Configuration
@MapperScan(basePackages = "com.quellan.zlflovemm.dao.mapper2",sqlSessionFactoryRef = "sqlSessionFactory2",sqlSessionTemplateRef = "sqlSessionTemplate2")
public class MyBatisConfigTwo {
    @Resource(name = "dbTwo")
    DataSource dbTwo;

    @Bean
    SqlSessionFactory sqlSessionFactory2()throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dbTwo);
        return bean.getObject();
    }
    @Bean
    SqlSessionTemplate sqlSessionTemplate2()throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory2());
    }
}