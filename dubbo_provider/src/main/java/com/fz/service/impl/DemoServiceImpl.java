package com.fz.service.impl;


import com.fz.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by FanZhen on 2019/6/20.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return name + ": Hello !";
    }

}
