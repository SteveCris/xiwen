package com.meyue.xiwen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableTransactionManagement

@MapperScan("com.meyue.xiwen.dao")
public class XiwenApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiwenApplication.class, args);
    }

}
