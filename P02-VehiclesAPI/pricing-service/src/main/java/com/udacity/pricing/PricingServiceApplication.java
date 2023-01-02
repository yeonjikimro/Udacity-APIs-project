package com.udacity.pricing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Creates a Spring Boot Application to run the Pricing Service.
 * TODO: Convert the application from a REST API to a microservice.
 * 주어진 차량의 가격을 저장하고 검색하는 백엔드를 시뮬레이트하는 REST WebService 역할을 한다. Eureka 서버를 통해 등록된 마이크로서비스를 변환한다
 */
@SpringBootApplication
public class PricingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PricingServiceApplication.class, args);
    }

}
