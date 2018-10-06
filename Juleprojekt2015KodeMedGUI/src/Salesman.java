
/**
 * Write a description of class Salesman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Salesman extends Employee
{
    
    public Salesman(Employee employee)
    {
       super(employee.name, employee.accountNumber, employee.salary, employee.address, employee.phoneNumber, employee.employeeID, employee.password);
    }
           
    public Lease createLease(Customer customer, Salesman salesman, String date)
    {
        if (loggedIn)
        {
           Lease newLease = new Lease(customer, salesman, date);
                   
           return newLease;
        }
        else
        {
            System.out.print("You need to log in to use this method");
            return null;
        }
    }
            
    public void addLeasableUnit(Lease lease, LeaseItem leaseItem)
    {
        if (loggedIn)
        {
            lease.addleaseItem(leaseItem);
        }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }
  
    public Sale createSale(Customer customer, Salesman salesman, String date)
    {
       if (loggedIn)
       {
           Sale newSale = new Sale(customer, salesman, date);
           
           return newSale;
       }
       else
       {
           System.out.print("You need to log in to use this method");
           return null;
       }
    }
    
    public void addSaleItem(Sale sale, SaleItem saleItem)
    {
        if (loggedIn)
        {
            sale.addSaleItem(saleItem);
        }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }
    
    public void printOutSale(Sale sale)
    {
        if (loggedIn)
        {
            System.out.print("Salesman: "+sale.salesman.employeeID+"    "+"Customer: "+sale.customer.customerID+ "  " + "Startdate: " + sale.date +"\n");
            System.out.print("Products: \n");
            for(SaleItem saleItem : sale.salesItemList)
            {
                System.out.print(saleItem.amount + "Product: " + saleItem.productInfo + "\n");
            }
            
        }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }
    
    public void printOutLease(Lease lease)
    {
        if (loggedIn)
        {
           System.out.print("Salesman: "+lease.salesman.employeeID+"    "+"Customer: "+lease.customer.customerID+ "  " + "Startdate: " + lease.startDate + "Returndate: " + lease.endDate + "\n");
           System.out.print("Products: \n");
           
             for(LeaseItem leaseItem : lease.leaseItemList)
           {
               System.out.print(leaseItem.amount + "Product: " + leaseItem.leasableUnit + "\n");
           }
        }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }
    

}
