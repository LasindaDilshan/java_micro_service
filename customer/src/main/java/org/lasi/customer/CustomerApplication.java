package org.lasi.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication(scanBasePackages = {"org.admq.changes","org.santa"})
@EnableEurekaClient
@EnableFeignClients

public class CustomerApplication {
    public static  void main(String[] args)
    {
        SpringApplication.run(CustomerApplication.class,args);
    }
//    @FeignClient("SANTA")
//    public interface santaClientI {
//        @GetMapping(path="api/v1/santa/{customerId}")
//        SantaRequest isSanta(@PathVariable("customerId") Integer customerId);
//    }
}
