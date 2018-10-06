
public class SaleItem
{
   public int amount;
   public Product productInfo;
   
   public SaleItem(int amount, Product product)
   {
       if (product.inventoryAmount > amount)
       {
       this.amount = amount;
       this.productInfo = product;
       product.inventoryAmount = product.inventoryAmount - amount;
        }
        else
        {
            System.out.print("The requested amount is not in inventory");
        }
   }
   
}
