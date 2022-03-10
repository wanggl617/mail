package com.mail.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 使用 Nacos 作为作为配置中心 统一管理配置
 * 1).引入依赖：
 * 2).创建一个 bootstrap.properties文件，springBoot中优先级最高，bootstrap 加载优先于 applicaton
 *      加入配置信息：
 *          spring.application.name=mail-member
 *          spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *      配置中心默认使用 properties 配置文件，如果需要使用其他配置文件如 yaml
 *          spring.cloud.nacos.config.file-extension=yaml
 * 3).向 Nacos Server 中添加配置
 *      Dara ID: mail-coupon.yaml（默认规则:服务ID.properties/yaml）
 *      配置内容：
 *          。。。。
 * 4).动态获取配置
 *      @RefreshCcope:动态获取并刷新配置
 *      @Value("${配置项名称}")
 *      如果配置中心和当前应用配置文件有相同的配置信息，优先使用配置中心。
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(CouponApplication.class, args);
    }

}
