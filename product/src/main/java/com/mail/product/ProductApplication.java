package com.mail.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1. 整合 mybatis-plus
 *      1).导入依赖
 *      2).配置数据源
 *          导入MySQL驱动
 *          在application.yaml中配置数据源相关信息
 *      3).配置mybatis-plus
 *          使用@MapperScan 扫描包
 *          告诉mybatis-plus ，sql映射文件在哪里
 */
@MapperScan("com.mail.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

}
