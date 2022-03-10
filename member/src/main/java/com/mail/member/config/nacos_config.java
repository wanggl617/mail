package com.mail.member.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
public class nacos_config {

    @Value("${feign.hystrix.enable}")
    String hystrixTime;

}
