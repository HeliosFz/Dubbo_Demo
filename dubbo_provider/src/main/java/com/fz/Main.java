package com.fz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by FanZhen on 2019/6/20.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        context.start();

        System.out.println("Dubbo provider is running...");

        try {
            System.in.read();//按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
