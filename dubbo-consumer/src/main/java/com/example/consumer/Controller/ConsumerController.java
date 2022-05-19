package com.example.consumer.Controller;


import com.example.comon.Service.ProvideService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ConsumerController {

    @Reference
    private ProvideService provideService;

    @RequestMapping("/B")
    public String getTest() {
        return provideService.testProvide();
    }
}
