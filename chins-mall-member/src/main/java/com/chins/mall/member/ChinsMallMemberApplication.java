package com.chins.mall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.chins.mall.member.mapper")
public class ChinsMallMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChinsMallMemberApplication.class, args);
    }
}
