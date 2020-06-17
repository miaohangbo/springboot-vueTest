package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Created by 54110 on 2020/4/20.
 */
@SpringBootApplication
public class VueApiApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(VueApiApplication.class);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //你的当前启动类名称
        return builder.sources(VueApiApplication.class);
    }
}
