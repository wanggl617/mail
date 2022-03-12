package com.mail.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1.远程调用别的微服务
 *      1).引入opne-feign
 *      2).编写一个接口，告诉SpringCloud 这个接口需要调用远程服务
<<<<<<< HEAD
 *      3).声明接口的每一个方法都是调用远程服务的哪一个请求
 *      4).开启远程调用功能
 */

//@EnableHystrix
/**
 *      3).声明接口的每一个方法都是调用 远程服务的哪一个请求
 *      4).开启远程调用功能
 */

@EnableFeignClients("com.mail.member.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class MemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class);
    }
}
