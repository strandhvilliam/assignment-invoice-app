import java.time.LocalDate;

public class CreditInvoice extends Invoice {


    public CreditInvoice(int number, double totalAmount, String specification, Customer customer, UserProfile userProfile, LocalDate dateCreated) {
        super(number, totalAmount, specification, customer, userProfile, dateCreated);
    }


    @Override
    public String toString() {
        return "CreditInvoice: " + super.toString();
    }
}