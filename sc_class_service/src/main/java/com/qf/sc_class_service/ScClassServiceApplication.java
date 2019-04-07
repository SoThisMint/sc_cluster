package com.qf.sc_class_service;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
@DubboComponentScan(value = "com.qf.service.impl")
@MapperScan(value = "com.qf.dao")
public class ScClassServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScClassServiceApplication.class, args);
    }

}
