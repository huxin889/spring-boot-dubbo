package com.ai.huxin.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * Created by huxin on 2017/8/13.
 */
@SpringBootApplication
public class Application {
    public static void main (String[] args){
        SpringApplication.run(Application.class, args);

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
