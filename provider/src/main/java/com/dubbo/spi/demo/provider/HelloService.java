package com.dubbo.spi.demo.provider;

import com.dubbo.spi.demo.api.HelloFacade;

public class HelloService implements HelloFacade {
    @Override
    public String hello(String name) {
        System.out.println("hello" + name);
        return "hello " + name;
    }
}
