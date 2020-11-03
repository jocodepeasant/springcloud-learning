package com.fzb.cloud.nacosconsume.service;

import com.fzb.cloud.nacosconsume.domain.CommonResult;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

/**
 * @author fzb
 * @date 2020/10/3 14:23
 */
@Service
public class TestService {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${service-url.nacos-server}")
    private String nacosServerUrl;

    @HystrixCommand(fallbackMethod = "getMessageDefault")
    public CommonResult getMessage(Long id) {
        ResponseEntity<CommonResult> forEntity = restTemplate.getForEntity(nacosServerUrl + "/user/message/{1}", CommonResult.class,id);
        if (forEntity.getStatusCode().is2xxSuccessful()){
            return forEntity.getBody();
        }else{
            return new CommonResult("操作失败", 500);
        }
    }

    public CommonResult getMessageDefault(@PathVariable Long id) {
        return new CommonResult("熔断:" + id);
    }
}
