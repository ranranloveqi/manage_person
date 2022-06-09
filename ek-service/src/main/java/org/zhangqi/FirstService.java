package org.zhangqi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ProjectName: manage_person
 * @Package: org.zhangqi
 * @Author: zhangqi
 * @Date: 2022/6/9 15:42
 * @Version: 1.0
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class FirstService {
    public static void main(String[] args) {
        new SpringApplicationBuilder(FirstService.class).run(args);
    }
}
