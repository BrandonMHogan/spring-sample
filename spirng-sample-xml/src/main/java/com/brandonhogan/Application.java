package com.brandonhogan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.brandonhogan.service.CustomerService;

/**
 * Created by brandon on 14/05/17.
 */
public class Application {

    public static void main(String[] args) {

        //CustomerService com.brandonhogan.service = new CustomerServiceImpl();

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService service = applicationContext.getBean("customerService", CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstName());

    }

}
