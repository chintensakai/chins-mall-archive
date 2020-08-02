package com.chins.mall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.chins.mall.ware.mapper")
public class ChinsMallWareApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChinsMallWareApplication.class, args);
    }
}
