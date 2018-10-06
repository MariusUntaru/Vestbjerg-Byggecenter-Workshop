
/**
 * Write a description of class Private here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personal extends Customer
{
   private Customer customer;
   private String cpr;
   
    public Personal(Customer customer, String CVRCPR)
    {
        super(customer.name, customer.address, customer.phoneNumber, customer.customerID);
        this.cpr = CVRCPR;
    }
    
    public Personal(String name, String address, String phoneNumber, int customerID, String CVRCPR)
    {
        super(name, address, phoneNumber, customerID);
        this.cpr = CVRCPR;
    }
    
}
