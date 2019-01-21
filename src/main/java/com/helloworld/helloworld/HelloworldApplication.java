package com.helloworld.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }


	  @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(HelloworldApplication.class);
    }


    @RequestMapping("helloworld")
    public String helloworld(){
        System.out.println(123);
        return "jenkins13213";

    }
}

