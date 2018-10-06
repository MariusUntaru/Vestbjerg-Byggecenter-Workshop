import java.util.ArrayList;

public class Customer
{
    public String name;
    public String address;
    public String phoneNumber;
    public int customerID;
    
    public Customer(String name, String address, String phoneNumber, int customerID)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.customerID = customerID;
    }

    public void changePhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    public void changeAddress(String address)
    {
        this.address = address;
    }

  
}

