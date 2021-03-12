package com.cz.start.listener;

import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author : zhang.cao
 * @date : 2021/3/12 18:03
 */
public class RedisApplicationListener implements
        ApplicationListener<SpringApplicationEvent> {
    @Override
    public void onApplicationEvent(SpringApplicationEvent springApplicationEvent) {
        System.out.println("监听 ApplicationStartingEvent 事件");
    }
}
