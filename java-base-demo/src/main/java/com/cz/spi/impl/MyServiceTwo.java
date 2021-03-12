package com.cz.spi.impl;

import com.cz.spi.MyService;

/**
 * @author : zhang.cao
 * @date : 2021/3/12 15:44
 */
public class MyServiceTwo implements MyService {
    @Override
    public void sayHello(String str) {
        System.out.println("TWO:" + str);
    }
}
