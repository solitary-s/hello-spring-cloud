package com.aloneness.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.aloneness.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {


    @Override
    public String sayHi(String message) {
        return String.format("Hi your message is : %s but request is bad",message);
    }
}
