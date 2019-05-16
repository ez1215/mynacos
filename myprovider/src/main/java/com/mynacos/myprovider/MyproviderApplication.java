package com.mynacos.myprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.mynacos.myprovider.mapper")
public class MyproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyproviderApplication.class, args);
    }

}
