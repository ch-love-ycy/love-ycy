package com.love.love520;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.love.love520.mapper")
@SpringBootApplication
public class Love520Application {

    public static void main(String[] args) {
        SpringApplication.run(Love520Application.class, args);
    }

}
