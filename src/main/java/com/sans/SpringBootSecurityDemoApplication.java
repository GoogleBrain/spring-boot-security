package com.sans;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.sans.core.dao") //扫描DAO
@SpringBootApplication
public class SpringBootSecurityDemoApplication {
    public static void main(String[] args) {

        SpringApplication.run(SpringBootSecurityDemoApplication.class, args);
    }
}
