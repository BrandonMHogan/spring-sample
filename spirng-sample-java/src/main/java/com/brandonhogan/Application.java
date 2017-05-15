package com.brandonhogan;

import com.brandonhogan.service.CustomerService;
import com.brandonhogan.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by brandon on 14/05/17.
 */
public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService service = appContext.getBean("customerService", CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstName());

    }

}
