package com.cz.start.conf;

import com.cz.start.build.RedisBuild;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisCluster;

/**
 * @author : zhang.cao
 * @date : 2021/3/12 17:35
 */
@Configuration
@EnableConfigurationProperties(value = RedisProperties.class)
public class RedisAutoConfiguration {
    private final RedisProperties redisProperties;

    public RedisAutoConfiguration(RedisProperties redisProperties) {
        this.redisProperties = redisProperties;
    }

    @Bean
    // 当前项目是否包含 JedisCluster Class
    @ConditionalOnMissingBean(JedisCluster.class)
    public JedisCluster demoService() {
        return RedisBuild.build(redisProperties);
    }
}
