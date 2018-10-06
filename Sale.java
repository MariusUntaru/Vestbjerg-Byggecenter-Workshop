import java.util.ArrayList;
/**
 * Write a description of class Sale here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
   public class Sale
{
    public Customer customer;
    public Salesman salesman;
    public ArrayList<SaleItem> salesItemList = new ArrayList<SaleItem>();
    private int total;
    public String date;
    
    
    public Sale(Customer customer, Salesman salesman, String date)
    {
       this.date = date;
       this.customer = customer;
       this.salesman = salesman;
    }
     
    public void addSaleItem(SaleItem saleItem)
    {
        salesItemList.add(saleItem);
    }
    

}


