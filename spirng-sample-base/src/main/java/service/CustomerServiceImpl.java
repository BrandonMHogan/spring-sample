package service;

import model.Customer;
import repository.CustomerRepository;
import repository.HibernateCustomerRepositoryImpl;

import java.util.List;

/**
 * Created by brandon on 14/05/17.
 * Service holds the business logic
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
