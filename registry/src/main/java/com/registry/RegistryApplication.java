package com.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：wqing
 * @date ：Created in 2019/11/8 0008 22:25
 */

@SpringBootApplication
@EnableEurekaServer
public class RegistryApplication extends SpringBootServletInitializer {
    public static void main(String [] args){
        SpringApplication.run(RegistryApplication.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }
}
