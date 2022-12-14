import java.io.Serializable;
import java.time.LocalDate;

public abstract class Invoice implements Serializable {


    private int number;
    private double totalAmount;
    private String specification;
    private Customer customer;
    private UserProfile userProfile;
    private LocalDate dateCreated;
    private boolean isPaid;


    public Invoice(int number, double totalAmount, String specification, Customer customer, UserProfile userProfile, LocalDate dateCreated) {
        this.number = number;
        this.totalAmount = totalAmount;
        this.specification = specification;
        this.customer = customer;
        this.userProfile = userProfile;
        this.dateCreated = dateCreated;
        isPaid = false;
    }


    public int getNumber() {
        return number;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getSpecification() {
        return specification;
    }

    public Customer getCustomer() {
        return customer;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setPaid() {
        isPaid = true;
    }

    @Override
    public String toString() {
        return "number=" + number +
                ", totalAmount=" + totalAmount +
                ", specification='" + specification + '\'' +
                ", customer=" + customer +
                ", userProfile=" + userProfile.getName() +
                ", dateCreated=" + dateCreated +
                ", isPaid=" + isPaid;
    }
}
