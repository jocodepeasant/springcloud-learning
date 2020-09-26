package com.fzb.cloud.nacossevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosSeviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosSeviceApplication.class, args);
    }

}
