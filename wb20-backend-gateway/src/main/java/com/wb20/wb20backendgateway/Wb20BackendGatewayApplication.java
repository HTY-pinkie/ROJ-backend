package com.wb20.wb20backendgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class Wb20BackendGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(Wb20BackendGatewayApplication.class, args);
    }

}
