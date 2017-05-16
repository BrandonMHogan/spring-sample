package com.brandonhogan;

import com.brandonhogan.repository.CustomerRepository;
import com.brandonhogan.repository.HibernateCustomerRepositoryImpl;
import com.brandonhogan.service.CustomerService;
import com.brandonhogan.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by bhogan on 2017-05-15.
 */
@Configuration
@ComponentScan({"com.brandonhogan"})
@PropertySource("app.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

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
