package com.hf.biz.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiehongfei
 * @description
 * @date 2023/8/27 14:41
 */
@SpringBootApplication(scanBasePackages = {"com.hf"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
