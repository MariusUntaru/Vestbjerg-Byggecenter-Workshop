
public class KitchenOrBathroom extends Product
{
    // used to differ between instances of bathrooms or kitchens (Example: b1, b2, b3 (bathroom1, bathroom2 ... ) k1, k2, k3 (kitchen1, kitchen3...)
    private String bathroomOrKitchenID;

    /**
     * Constructor for objects of class KitchenOrBathroom
     */
    public KitchenOrBathroom(Product product)
    {
        // initialise instance variables
        super(product.unitPrice, product.weight, product.size, product.description, product.inventoryAmount);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setID(String bORkID)
    {
        // put your code here
        this.bathroomOrKitchenID = bORkID;
    }
}
