package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class ServiceClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceClientApplication.class,args);
    }
    @Autowired
    private ServiceHelloFeign serviceHelloFeign;

    @RequestMapping("/hi")
    public String hi(){
        return "hello,world,service-client!";
    }

    @RequestMapping("/service-hello")
    public String hello(){
        return serviceHelloFeign.hi();
    }
}
