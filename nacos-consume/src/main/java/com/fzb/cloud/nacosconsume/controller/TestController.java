package com.fzb.cloud.nacosconsume.controller;

import com.fzb.cloud.nacosconsume.domain.CommonResult;
import com.fzb.cloud.nacosconsume.service.TestService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author fzb
 * @date 2020/09/23
 */
@RestController
@RequestMapping("/user")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/getMessage/{id}")
    public CommonResult getMessage(@PathVariable Long id){
        return testService.getMessage(id);
    }
}
