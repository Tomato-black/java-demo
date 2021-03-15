package com.cz;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author : zhang.cao
 * @date : 2021/3/12 18:17
 */
@MapperScan("com.cz.mapper")
@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})
public class ServiceApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ServiceApplication.class, args);
    }
}
