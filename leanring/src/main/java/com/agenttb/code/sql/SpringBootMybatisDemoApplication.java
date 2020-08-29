package com.agenttb.code.sql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.agenttb.code.sql.dao")
@EnableTransactionManagement
public class SpringBootMybatisDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisDemoApplication.class, args);
    }

}
