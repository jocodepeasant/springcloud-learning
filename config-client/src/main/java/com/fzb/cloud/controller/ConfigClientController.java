package com.fzb.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fzb
 * @date 2020/10/4 18:32
 */
@RestController
@RequestMapping("/config")
public class ConfigClientController {

    @Value("${config.info}")
    private String info;

    @RequestMapping("/info")
    public String getInfo(){
        return info;
    }
}
