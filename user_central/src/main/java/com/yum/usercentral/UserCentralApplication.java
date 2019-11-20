package com.yum.usercentral;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：wqing
 * @date ：Created in 2019/11/11 0011 22:42
 */

@SpringBootApplication
@EnableEurekaClient
public class UserCentralApplication {

    public static void main(String [] args){
        SpringApplication.run(UserCentralApplication.class);
    }

}
