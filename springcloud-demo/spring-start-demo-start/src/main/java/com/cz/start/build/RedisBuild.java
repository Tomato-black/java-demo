package com.cz.start.build;

import com.cz.start.conf.RedisProperties;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author : zhang.cao
 * @date : 2021/3/12 17:38
 */
public class RedisBuild {


    public static JedisCluster build(RedisProperties redisProperties) {
        Set<HostAndPort> nodes = new HashSet<>();
        Stream.of(redisProperties.getHosts()).forEach((String host) -> {
            String[] parts = StringUtils.split(host, ":");
            Assert.state(parts.length == 2,
                    "redis node should be defined as 'host:port', not '" + Arrays.toString(parts) + "'");
            nodes.add(new HostAndPort(parts[0], Integer.parseInt(parts[1])));
        });
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(redisProperties.getMaxIdle());
        jedisPoolConfig.setMaxTotal(redisProperties.getMaxTotal());
        jedisPoolConfig.setMinIdle(redisProperties.getMinIdle());
        jedisPoolConfig.setTestOnBorrow(redisProperties.isTestOnBorrow());
        if (StringUtils.isEmpty(redisProperties.getPassword())) {
            return new JedisCluster(nodes, redisProperties.getConnectionTimeout(),
                    redisProperties.getSoTimeout(), redisProperties.getMaxAttempts()
                    , redisProperties.getPassword(), jedisPoolConfig);
        } else {
            return new JedisCluster(nodes, redisProperties.getConnectionTimeout(),
                    redisProperties.getSoTimeout(), redisProperties.getMaxAttempts(), jedisPoolConfig);
        }
    }
}
