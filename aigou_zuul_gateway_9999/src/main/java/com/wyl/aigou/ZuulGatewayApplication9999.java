package com.wyl.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulGatewayApplication9999 {
    public static void main( String[] args ) {
        SpringApplication.run(ZuulGatewayApplication9999.class);
    }
}
