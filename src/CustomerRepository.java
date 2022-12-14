import java.util.Collection;
import java.util.List;

public interface CustomerRepository {

    List<Customer> readAll();
    void add(Customer customer);
}
