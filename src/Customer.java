import java.io.Serializable;

public class Customer implements Serializable {

    private int id;
    private String accountNumber;
    private String name;
    private String address;
    private String orgNumber;

    public Customer(int id, String name, String address, String accountNumber, String orgNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.accountNumber = accountNumber;
        this.orgNumber = orgNumber;
    }

    public int getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getOrgNumber() {
        return orgNumber;
    }


    @Override
    public String toString() {
        return getId() + "---" + getName();
    }

}