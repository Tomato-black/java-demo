package com.cz.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import redis.clients.jedis.JedisCluster;

import java.util.Map;

/**
 * @author : zhang.cao
 * @date : 2021/3/12 18:17
 */
@SpringBootApplication
public class ServiceApplication {
    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(ServiceApplication.class, args);
        JedisCluster bean = context.getBean(JedisCluster.class);
        String test = bean.get("test");
        System.out.println(test);
    }
}
