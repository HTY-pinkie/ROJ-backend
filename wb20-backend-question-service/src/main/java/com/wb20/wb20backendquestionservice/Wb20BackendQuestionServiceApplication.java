package com.wb20.wb20backendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.wb20.wb20backendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
//定义扫描别的模块的com.wb20，目标扫到全局异常处理器GlobalExceptionHandler
@ComponentScan("com.wb20")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.wb20.wb20backendserviceclient.service"})
public class Wb20BackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Wb20BackendQuestionServiceApplication.class, args);
    }

}
