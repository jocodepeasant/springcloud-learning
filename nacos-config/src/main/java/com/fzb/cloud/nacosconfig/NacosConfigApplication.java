package com.fzb.cloud.nacosconfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class NacosConfigApplication {

    @Value("${config.info}")
    public String info;

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigApplication.class, args);
        NacosConfigApplication nacosConfigApplication = new NacosConfigApplication();
        log.error(nacosConfigApplication.info);
    }

}
