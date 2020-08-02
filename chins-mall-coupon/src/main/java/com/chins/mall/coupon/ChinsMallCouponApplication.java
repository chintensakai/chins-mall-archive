package com.chins.mall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.chins.mall.coupon.mapper")
public class ChinsMallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChinsMallCouponApplication.class, args);
    }
}
