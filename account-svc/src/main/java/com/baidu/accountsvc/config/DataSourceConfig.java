package com.baidu.accountsvc.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource hikariDataSource(Environment env){
        HikariDataSource hs=new HikariDataSource();
        hs.setJdbcUrl(env.getProperty("spring.datasource.url"));
        hs.setUsername(env.getProperty("spring.datasource.username"));
        hs.setPassword(env.getProperty("spring.datasource.password"));
        hs.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        return hs;
    }
}
