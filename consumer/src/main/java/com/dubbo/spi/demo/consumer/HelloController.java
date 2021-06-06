package com.dubbo.spi.demo.consumer;

import com.dubbo.spi.demo.api.HelloFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloFacade helloFacade;

    @RequestMapping(value = "/hello")
    public String hello(){
        return helloFacade.hello("tom");
    }

}
