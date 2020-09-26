package com.fzb.cloud.nacosconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fzb
 * @date 2020/09/26
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${config.info}")
    private String info;

    @GetMapping("/info")
    public String getInfo() {
        return info+this.toString();
    }
}
