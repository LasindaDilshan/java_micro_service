package org.santaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(
        scanBasePackages = "com.santa"
)
@EnableFeignClients
@EnableEurekaClient
public class SantaApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(SantaApplication.class,args);
    }
}
