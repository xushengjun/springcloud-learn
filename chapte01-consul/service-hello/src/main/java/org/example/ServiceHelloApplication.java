package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ServiceHelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHelloApplication.class,args);
    }
    @RequestMapping("/hi")
    public String hi(){
        return "hello,service-hello!";
    }
}
