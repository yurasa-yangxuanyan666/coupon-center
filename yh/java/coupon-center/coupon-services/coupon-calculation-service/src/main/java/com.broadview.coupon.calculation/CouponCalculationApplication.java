package com.broadview.coupon.calculation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 优惠券计算，纯计算密集型服务
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages={"com.broadview"})
public class CouponCalculationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CouponCalculationApplication.class, args);
    }

}
