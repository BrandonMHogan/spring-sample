package com.brandonhogan;

import com.brandonhogan.repository.CustomerRepository;
import com.brandonhogan.repository.HibernateCustomerRepositoryImpl;
import com.brandonhogan.service.CustomerService;
import com.brandonhogan.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by bhogan on 2017-05-15.
 */
@Configuration
@ComponentScan({"com.brandonhogan"})
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService gerCustomerService() {
        // Constructor Injection
       // CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());

        // Setter Injection
        CustomerServiceImpl service = new CustomerServiceImpl();
        service.setCustomerRepository(getCustomerRepository());

        return service;
    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }
}
