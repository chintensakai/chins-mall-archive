package com.chins.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.chins.mall.product.mapper")
public class ChinsMallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChinsMallProductApplication.class, args);
    }
}
