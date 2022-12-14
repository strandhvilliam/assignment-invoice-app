import java.time.LocalDate;
import java.util.Scanner;

public class InvoiceFactory {

    public Invoice create(int invoiceNumber, UserProfile userProfile, Customer customer) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount (if credit, enter negative): ");
        double amount = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter specification: ");
        String specification = sc.nextLine();
        LocalDate dateCreated = LocalDate.now();

        if (amount < 0) {
            return new CreditInvoice(invoiceNumber, amount, specification,  customer, userProfile, dateCreated);
        } else {
            LocalDate dueDate = LocalDate.now().plusDays(30);
            return new RegularInvoice(invoiceNumber, amount, specification,  customer, userProfile, dateCreated, dueDate);
        }
    }
}