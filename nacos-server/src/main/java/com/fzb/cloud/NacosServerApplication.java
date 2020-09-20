package com.fzb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author fzb
 * @date 2020/09/20
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosServerApplication {
    public static void main(String[] args) {
        new SpringApplication(NacosServerApplication.class);
    }
}
