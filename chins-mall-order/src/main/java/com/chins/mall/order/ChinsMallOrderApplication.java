package com.chins.mall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.chins.mall.order.mapper")
public class ChinsMallOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChinsMallOrderApplication.class, args);
    }
}
