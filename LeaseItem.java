
/**
 * Write a description of class SaleItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeaseItem
{
   public int amount;
   public LeasableUnit leasableUnit;
   public int numberOfDays;
   
   public LeaseItem(int amount, LeasableUnit leasableUnit, int numberOfDays)
   {
       if (leasableUnit.stock > amount)
       {
       this.amount = amount;
       this.leasableUnit = leasableUnit;
       this.numberOfDays = numberOfDays;
       leasableUnit.stock = leasableUnit.stock - amount;
       }
       else
       {
       System.out.print("The requested amount is not in stock");    
       }
   }

}
