import java.time.LocalDate;

public class RegularInvoice extends Invoice {


    private LocalDate dueDate;

    public RegularInvoice(int invoice, double totalAmount, String specification, Customer customer, UserProfile userProfile, LocalDate dateCreated, LocalDate dueDate) {
        super(invoice, totalAmount, specification, customer, userProfile, dateCreated);
        this.dueDate = dueDate;
    }


    public LocalDate getDueDate() {
        return dueDate;
    }



    @Override
    public String toString() {
        return "Invoice: " + super.toString() + ", dueDate=" + dueDate;
    }
}