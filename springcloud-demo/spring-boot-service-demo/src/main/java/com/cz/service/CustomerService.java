package com.cz.service;

import com.cz.entity.CustomerLogin;
import com.cz.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : zhang.cao
 * @date : 2021/3/15 14:56
 */
@Service
public class CustomerService {
    @Resource
    private CustomerMapper customerMapper;

   public List<CustomerLogin> getAll(){
       return customerMapper.getAll();
   }
    public void insert(){
        CustomerLogin customerLogin = new CustomerLogin();
        customerLogin.setLoginName("zhang.cao");
        customerLogin.setPassword("123456");
        customerMapper.insert(customerLogin);
    }
}
