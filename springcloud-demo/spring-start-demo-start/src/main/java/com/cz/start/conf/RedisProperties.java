package com.cz.start.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author : zhang.cao
 * @date : 2021/3/12 17:27
 * redis:
 *   hosts: 192.168.162.235:6379,192.168.162.235:6380,192.168.162.235:6381
 *   #192.168.162.235:6382,192.168.162.235:6383,192.168.162.235:6384
 *   password: 123456
 *   maxTotal: 8
 *   maxIdle: 8
 *   minIdle: 0
 *   maxWaitMillis: 1
 *   testOnBorrow: false
 *   connectionTimeout: 5000
 *   soTimeout: 5000
 *   maxAttempts: 5
 *   database: 0
 */
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {
    private String[] hosts;
    private String username;
    private String password;
    private int maxTotal;
    private int maxIdle;
    private int minIdle;
    private boolean testOnBorrow;
    private int connectionTimeout;
    private int soTimeout;
    private int maxAttempts;
    private int database;

    public String[] getHosts() {
        return hosts;
    }

    public void setHosts(String[] hosts) {
        this.hosts = hosts;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(int maxTotal) {
        this.maxTotal = maxTotal;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public int getSoTimeout() {
        return soTimeout;
    }

    public void setSoTimeout(int soTimeout) {
        this.soTimeout = soTimeout;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }

    public void setMaxAttempts(int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    public int getDatabase() {
        return database;
    }

    public void setDatabase(int database) {
        this.database = database;
    }
}
