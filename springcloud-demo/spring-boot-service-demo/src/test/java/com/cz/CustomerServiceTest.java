package com.cz;

import com.cz.entity.CustomerLogin;
import com.cz.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author : zhang.cao
 * @date : 2021/3/15 14:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {
    @Autowired
    private CustomerService customerService;
    @Test
    public void readWriterTest(){
        customerService.insert();
        List<CustomerLogin> all = customerService.getAll();

        System.out.println("end");
    }
}
