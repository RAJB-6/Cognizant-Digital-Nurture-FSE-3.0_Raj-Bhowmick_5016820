public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        // Simulate finding a customer from a database
        Customer customer = new Customer(id, "Aritra", "aritrachakraborty@gmail.com");
        return customer;
    }
}