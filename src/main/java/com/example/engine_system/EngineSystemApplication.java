package com.example.engine_system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
// 有mapper包扫描就可以不用写@Mapper
@MapperScan(basePackages = "com.example.engine_system.mapper")
public class EngineSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EngineSystemApplication.class, args);
    }

}
