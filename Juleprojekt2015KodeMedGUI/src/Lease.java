import java.util.ArrayList;


public class Lease
{
    public Customer customer;
    public Salesman salesman;
    public int total;
    public String startDate;
    public String endDate;
    public ArrayList<LeaseItem> leaseItemList = new ArrayList<LeaseItem>();
    
    
    public Lease(Customer customer, Salesman salesman, String startDate /*31-12-00*/)
    {
       this.customer = customer;
       this.salesman = salesman;
       this.startDate = startDate;
       System.out.print(startDate);
    }
    
        public void addleaseItem(LeaseItem leaseItem)
    {
       int year = 0, month = 0, day = 0;
       String[] temp;
       
       temp = this.startDate.split(":");
       
       System.out.print(year + " " + month + " " + day + "\n");
       System.out.print("Startdate: " + startDate + "\n");
       
       
       year = Integer.parseInt(temp[3]);
       month = Integer.parseInt(temp[2]);
       day = Integer.parseInt(temp[1]);
       day = day + leaseItem.numberOfDays;
       
       System.out.print(year + " " + month + " " + day + "\n");
       
       if(month == 2)
       {
           if(year % 4 == 0)
           {
               if(day > 29)
               {
                month = month + 1;
                day = day - 29;
                endDate = Integer.toString(day)+":"+Integer.toString(month)+":"+Integer.toString(year);
               }
               else
               {
               endDate = Integer.toString(day)+":"+Integer.toString(month)+":"+Integer.toString(year);               
               }
            }
           else
           {
               if(day > 28)
               {
                month = month + 1;
                day = day - 28;
                endDate = Integer.toString(day)+":"+Integer.toString(month)+":"+Integer.toString(year);
               }    
               else
               {
               endDate = Integer.toString(day)+":"+Integer.toString(month)+":"+Integer.toString(year);    
               }
           }
       }
       else if(month == 4 || month == 6 ||month == 9 ||month == 11)
       {
               if(day > 30)
               {
                month = month + 1;
                day = day - 30;
                endDate = Integer.toString(day)+":"+Integer.toString(month)+":"+Integer.toString(year);
               }    
               else
               {
               endDate = Integer.toString(day)+":"+Integer.toString(month)+":"+Integer.toString(year);    
               }   
       }
       else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)
       {
               if(day > 31)
               {
                month = month + 1;
                day = day - 31;
                endDate = Integer.toString(day)+":"+Integer.toString(month)+":"+Integer.toString(year);
               }    
               else
               {
               endDate = Integer.toString(day)+":"+Integer.toString(month)+":"+Integer.toString(year);    
               }   
       }
       else if(month == 12)
       {
               if(day > 31)
               {
                month = 1;
                year = year + 1;
                day = day - 31;
                endDate = Integer.toString(day)+":"+Integer.toString(month)+":"+Integer.toString(year);
               }    
               else
               {
                endDate = Integer.toString(day)+":"+Integer.toString(month)+":"+Integer.toString(year);    
               }   
       }
       else
       {
           System.out.print("There is something wrong with the string");    
       }
       
       leaseItemList.add(leaseItem);
       
    }
    
    public int getTotal()
    {
        return total;
    }
    
    public String getDate()
    {
        return startDate;
    }
    
    public void setTotal(int newTotal)
    {
        this.total = newTotal;
    }
    
    public void setDate(String newDate)
    {
        this.startDate = newDate;
    }
    
   // public void getCustomerInfo(Customer customer)
   // {
   //     int theID;
   //     String theName;
    //    String theAddress;
   //     String thePhoneNumber;
   //     theID = salesman.getSalesmanID();
   //     theName = customer.getSalesmanName();
   //     theAddress = customer.getAddress();
   //     thePhoneNumber = customer.getPhoneNumber;
   //     System.out.println("Customer's name:" + theName);
   //     System.out.println("Customer's address:" + theName);
   //     System.out.println("Customer's phone number:" + theName);
    //    System.out.println("Customer's ID:" + theID);
    //}
    /*
    public void getSalesmanInfo(Salesman salesman)
    {
        int theID;
        String theName;
        theID = salesman.getSalesmanID();
        theName = salesman.getSalesmanName();
        System.out.println("Salesman's name:" + theName);
        System.out.println("Salesman's ID:" + theID);
    }
    */
}
