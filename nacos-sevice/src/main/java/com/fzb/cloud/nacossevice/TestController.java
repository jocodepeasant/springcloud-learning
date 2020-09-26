package com.fzb.cloud.nacossevice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fzb
 * @date 2020/09/26
 */
@RestController
@RequestMapping("/user")
public class TestController {

    @GetMapping("/message")
    public CommonResult message(){
        return new CommonResult(null, "aaa", 200);
    }
}
