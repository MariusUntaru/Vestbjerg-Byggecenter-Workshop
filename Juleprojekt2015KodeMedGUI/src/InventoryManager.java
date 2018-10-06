
/**
 * Write a description of class inventoryManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InventoryManager extends Employee
{
   
    
    public InventoryManager(Employee employee)
    {
        super(employee.name, employee.accountNumber, employee.salary, employee.address, employee.phoneNumber, employee.employeeID, employee.password);
    }
    
    public LeasableUnit addLeasableUnit(int unitPrice, int weight, String size, String description, int stock)
    {
        if (loggedIn)
        {
            LeasableUnit newLeasableUnit = new LeasableUnit(unitPrice, weight, size, description, stock);
        
            return newLeasableUnit;
        }
        else
        {
            System.out.print("You need to log in to use this method");
            return null;
        }
    }
    
    public Product addProduct(int unitPrice, int weight, String size, String description, int inventoryAmount)
    {
        if (loggedIn)
        {
            Product newProduct = new Product(unitPrice, weight, size, description, inventoryAmount);
        
            return newProduct;
        }
        else
        {
            System.out.print("You need to log in to use this method");
            return null;
        }
    }
    
    public void changeProductPrice(Product product,int newPrice)
    {     
        if (loggedIn)
        {
            product.unitPrice = newPrice;
        }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }
    
    public void changeLeasableUnitPrice(LeasableUnit unit,int newPrice)
    {      
        if (loggedIn)
        {
            unit.unitPrice = newPrice;
        }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }
    
        public void changeProductWeight(Product product,int newWeight)
    {      
        if (loggedIn)
        {
            product.weight = newWeight;
        }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }
    
    public void changeLeasableUnitWeight(LeasableUnit unit, int newWeight)
    {      
        if (loggedIn)
        {
            unit.weight = newWeight;
        }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }
    
        public void changeProduct(Product product, String newSize)
    {      
        if (loggedIn)
        {
            product.size = newSize;
        }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }
    
    public void changeLeasableUnitSize(LeasableUnit unit, String newSize)
    {      
        if (loggedIn)
        {
            unit.size = newSize;
        }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }
    
        public void changeProductSize(Product product, String newDescription)
    {      
        if (loggedIn)
        {
            product.description = newDescription;
        }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }
    
    public void changeLeasableUnitDescription(LeasableUnit unit, String newDescription)
    {    
        if (loggedIn)
        {
            unit.description = newDescription;
        }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }
    
    public void orderInventory(Product product, int orderInventoryAmount)
    {
        if (loggedIn)
        {
            int tp = product.inventoryAmount;
            int ip = tp + orderInventoryAmount;
            product.inventoryAmount = ip;
        }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }
    
    public void updateStockpile(LeasableUnit leasableunit, int orderStock)
    {
        if (loggedIn)
        {
            leasableunit.stock = leasableunit.stock + orderStock;
        }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }
}