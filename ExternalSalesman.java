

public class ExternalSalesman extends Salesman
{
    // instance variables - replace the example below with your own
    private int vanID;

    /**
     * Constructor for objects of class ExternalSalesman
     */
    public ExternalSalesman(Salesman SM)
    {
        super(SM);
    }
    
    public void setVanID(int vanID)
    {
        if (loggedIn)
        {
            this.vanID = vanID;
        }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }

}
