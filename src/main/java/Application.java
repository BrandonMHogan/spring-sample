import service.CustomerService;
import service.CustomerServiceImpl;

/**
 * Created by brandon on 14/05/17.
 */
public class Application {

    public static void main(String[] args) {

        CustomerService service = new CustomerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());

    }

}
