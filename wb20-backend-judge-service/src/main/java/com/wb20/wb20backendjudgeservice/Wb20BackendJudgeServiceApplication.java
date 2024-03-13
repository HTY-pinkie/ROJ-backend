package com.wb20.wb20backendjudgeservice;

import com.wb20.wb20backendjudgeservice.rabbitmq.InitRabbitMq;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
//定义扫描别的模块的com.wb20，目标扫到全局异常处理器GlobalExceptionHandler
@ComponentScan("com.wb20")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.wb20.wb20backendserviceclient.service"})
public class Wb20BackendJudgeServiceApplication {

    public static void main(String[] args) {
        //初始化消息队列
        InitRabbitMq.doInit();
        SpringApplication.run(Wb20BackendJudgeServiceApplication.class, args);
    }

}
