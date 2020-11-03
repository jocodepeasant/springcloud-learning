package com.fzb.cloud.nacosconsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@SpringBootApplication
//@EnableDiscoveryClient
//@EnableCircuitBreaker
//包含上面三个
@SpringCloudApplication
public class NacosConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumeApplication.class, args);
    }

}
