package com.dds.sbswagger.testcontroller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DDS
 * @date 2019/9/10 13:55
 */
@RestController
@RequestMapping("/test")
@Api(tags = "测试相关接口", description = "提供测试相关的Rest API")
public class TestController {

    @GetMapping("/test")
    public void test() {
        System.out.println("test");
    }

}
