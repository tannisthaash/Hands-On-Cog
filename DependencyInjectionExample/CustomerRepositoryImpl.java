package DependencyInjectionExample;

public class CustomerRepositoryImpl
        implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        if (id == 101) {
            return "Mohit";
        } else if (id == 102) {
            return "Rishi";
        }
        return "Customer Not Found";
    }
}