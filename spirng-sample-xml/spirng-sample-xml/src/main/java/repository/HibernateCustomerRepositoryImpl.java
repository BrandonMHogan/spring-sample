package repository;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brandon on 14/05/17.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Brandon");
        customer.setLastName("Hogan");

        customers.add(customer);

        return customers;
    }

}
