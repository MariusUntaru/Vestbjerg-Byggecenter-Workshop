import java.lang.Boolean;
import java.lang.System;
import java.util.ArrayList;

public class Employee
{
    public String name;
    public String accountNumber;
    public int salary;
    public String address;
    public String phoneNumber;
    public String employeeID;
    public static String password;
    public static boolean loggedIn;
    public static ArrayList<Employee> employeeList = new ArrayList<>();  

    
    
    public Employee(String name, String accountNumber, int salary, String address, String phoneNumber, String employeeID, String password)
    {

        this.name = name;
        this.accountNumber = accountNumber;
        this.salary = salary;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.employeeID = employeeID;
        this.password = password;
        
    }
    
    public static void startup()
    {
        Employee administrator = new Employee("Administrator", "950812", 0, "InsideComputer", "60172903", "admin1", "hotdog");

        employeeList.add(administrator);

    }
    public void logIn(String password)
    {
        if (this.password == password)
        {
            this.loggedIn = true;
            System.out.print("You are now logged in");
        }
        else
        {
            System.out.print("You can't log in with the information given");
        }
    }
    
    public void logOut()
    {
        this.loggedIn = false;
    }
    
    public void changePassword(String newpass)
    {
        if (loggedIn)
        {
            this.password = newpass;
        }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }
    
    public void setPhoneNumber (String phoneNumber)
    {
        if (loggedIn)
        {
        this.phoneNumber = phoneNumber;
         }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }
    
    public void setAddress (String address)
    {
        if (loggedIn)
        {
        this.address = address;
        }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }
    
    public void setAccountNumber(String accountNumber)
    {
        if (loggedIn)
        {
        this.accountNumber = accountNumber;         
        }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }
    
    public int getSalary()
    {
        if(loggedIn)
        {
        return this.salary;
        }
        else
        {
            System.out.print("You need to log in to use this method");
            return 0;
        }
    }
    
    
    /*
    public void setSalary(int salary, int safety)
    {
        if (safety == 12)
        {
        this.salary = salary;
        }
        else
        {
        System.out.print("You do not have the authority to do this");
        }
    }
    */
    
}
