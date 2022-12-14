
import java.io.Serializable;

public class UserProfile implements Serializable {

    private String name;
    private String address;
    private String orgNumber;
    private String accountNumber;


    public UserProfile(String name,String address, String orgNumber,  String accountNumber) {
        this.name = name;
        this.address = address;
        this.orgNumber = orgNumber;
        this.accountNumber = accountNumber;
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

    public String getAccountNumber() {
        return accountNumber;
    }
}
