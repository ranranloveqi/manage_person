package com.zhangqi;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BaseServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(BaseServiceApplication.class).run(args);
    }
}
