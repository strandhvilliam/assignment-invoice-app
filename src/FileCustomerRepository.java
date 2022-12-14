import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCustomerRepository implements CustomerRepository {


    @Override
    public List<Customer> readAll() {
        List<Customer> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("customers.txt"))) {

            String line;
            while((line = br.readLine()) != null) {
                int id = Integer.parseInt(line);
                String name = br.readLine();
                String address = br.readLine();
                String accountNumber = br.readLine();
                String orgNumber = br.readLine();
                list.add(new Customer(id, name, address, accountNumber, orgNumber));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public void add(Customer customer) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("customers.txt", true))) {
            bw.write("\n" + customer.getId()+ "\n");
            bw.write(customer.getName()+ "\n");
            bw.write(customer.getAddress()+ "\n");
            bw.write(customer.getAccountNumber()+ "\n");
            bw.write(customer.getOrgNumber());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
