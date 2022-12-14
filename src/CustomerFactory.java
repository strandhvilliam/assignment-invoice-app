import java.util.Scanner;

public class CustomerFactory {

    public Customer create(int id) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        System.out.print("Enter accountNumber: ");
        String accountNumber = sc.nextLine();
        System.out.print("Enter orgNumber: ");
        String orgNumber = sc.nextLine();

        return new Customer(id, name, address, accountNumber, orgNumber);

    }
}