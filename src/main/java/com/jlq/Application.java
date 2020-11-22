package com.jlq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author ：jlq
 * @date ：Created in 2020/11/20 19:57
 */
@SpringBootApplication
@MapperScan(basePackages = "com.jlq.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}


