package com.cz.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author : zhang.cao
 * @date : 2021/3/12 15:47
 */
public class SpiDoor {
    public static void main(String[] args) {
        ServiceLoader<MyService> load = ServiceLoader.load(MyService.class);
        Iterator<MyService> iterator = load.iterator();
        while (iterator.hasNext()){
            MyService next = iterator.next();
            next.sayHello("hello");
        }
    }
}
