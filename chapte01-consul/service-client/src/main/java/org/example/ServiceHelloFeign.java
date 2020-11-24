package org.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "service-hello")
public interface ServiceHelloFeign {
    @RequestMapping("/hi")
    String hi();
}
