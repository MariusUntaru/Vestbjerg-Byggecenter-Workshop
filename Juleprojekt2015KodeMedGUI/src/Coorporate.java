
public class Coorporate extends Customer
{
    private static Customer customer;
    private String cvr;
    
    public Coorporate(Customer customer, String CVRCPR)
    {
        super(customer.name, customer.address, customer.phoneNumber, customer.customerID);
        this.cvr = CVRCPR;
    }
    
    public Coorporate(String name, String address, String phoneNumber, int customerID, String CVRCPR)
    {
        super(name, address, phoneNumber, customerID);
        this.cvr = CVRCPR;
    }
    
    public void changeCvrNumber(String newCvr)
    {
       cvr = newCvr;
    }
    
    public void changeCoorpName(Customer customer, String newName)
    {
       customer.name = newName;
    }
}
