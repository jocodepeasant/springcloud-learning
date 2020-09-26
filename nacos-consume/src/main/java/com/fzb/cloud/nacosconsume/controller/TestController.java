package com.fzb.cloud.nacosconsume.controller;

import com.fzb.cloud.nacosconsume.domain.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
    private RestTemplate restTemplate;
    @Value("${service-url.nacos-server}")
    private String nacosServerUrl;

    @GetMapping("/getMessage")
    public CommonResult getMessage(){
        ResponseEntity<CommonResult> forEntity = restTemplate.getForEntity(nacosServerUrl + "/user/message", CommonResult.class);
        if (forEntity.getStatusCode().is2xxSuccessful()){
            return forEntity.getBody();
        }else{
            return new CommonResult("操作失败", 500);
        }
    }
}
