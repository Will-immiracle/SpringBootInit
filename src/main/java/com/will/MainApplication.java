package com.will;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: SpringBootInit
 * @description: 启动类
 * @author: Mr.Zhang
 * @create: 2025-04-06 00:26
 **/

@SpringBootApplication
@MapperScan("com.will.mapper")
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
