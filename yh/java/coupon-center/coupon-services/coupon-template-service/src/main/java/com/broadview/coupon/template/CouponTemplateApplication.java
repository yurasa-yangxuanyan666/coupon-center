package com.broadview.coupon.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@ComponentScan(basePackages = {"com.broadview"})
@EnableJpaAuditing
@EnableDiscoveryClient
public class CouponTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(CouponTemplateApplication.class, args);
    }


}
