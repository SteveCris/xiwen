package com.meyue.xiwen;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAdminServer
@MapperScan("com.meyue.xiwen.dao")
public class XiwenApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiwenApplication.class, args);
    }

}
