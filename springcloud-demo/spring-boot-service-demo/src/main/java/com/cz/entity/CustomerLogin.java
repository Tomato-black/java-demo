package com.cz.entity;

/**
 * @author : zhang.cao
 * @date : 2021/3/15 14:49
 */
public class CustomerLogin {
    private Integer customerId;
    private String loginName;
    private String password;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
