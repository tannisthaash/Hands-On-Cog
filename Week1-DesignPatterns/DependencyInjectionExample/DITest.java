package DependencyInjectionExample;
public class DITest {
    public static void main(String[] args) {
        CustomerRepository repository =
                new CustomerRepositoryImpl();

        CustomerService service =
                new CustomerService(repository);
        service.getCustomer(101);
        service.getCustomer(102);
        service.getCustomer(999);
    }
}
