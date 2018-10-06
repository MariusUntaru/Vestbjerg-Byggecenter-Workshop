

public class Manager extends InventoryManager
{

    int safety = 12;
    
    public Manager(InventoryManager IM)
    {
        super(IM);
    
    }
    
    public void setEmployeeSalary(int salary, Employee employee)
    {  
        if (loggedIn)
        {
            employee.salary = salary;
        }
        else
        {
            System.out.print("You need to log in to use this method");
        }
    }
    
    public Employee createAnEmployee(String name, String accountNumber, int salary, String address, String phoneNumber, String employeeID, String password)
    {
       if (loggedIn)
       {
           Employee newEmployee = new Employee(name, accountNumber, salary, address, phoneNumber, employeeID, password);
           
           return newEmployee;
       }
       else
       {
            System.out.print("You need to log in to use this method");
            return null;
       }
    }
    
    public Employee promoteEmployee(Employee emp, String employeeTitle)
    {
        if(loggedIn)
        {
            if(employeeTitle == "Manager")
            {
                InventoryManager newIM = new InventoryManager(emp);
                
                Manager newManager = new Manager(newIM);
                
                return newManager;
    
            }
            else if(employeeTitle == "deputyManager")
            {
                DeputyManager newDM = new DeputyManager(emp);
            }
            else if(employeeTitle == "Staffassociation")
            {
                ManagerStaffAssociation newMSA = new ManagerStaffAssociation(emp);
                
                return newMSA;
            }
              else if(employeeTitle == "OfficeStaff")
            {
                OfficeStaff newOS = new OfficeStaff(emp);
                
                return newOS;
            }
              else if(employeeTitle == "InventoryManager")
            {
                InventoryManager newIM = new InventoryManager(emp);
                
                return newIM;
            }
              else if(employeeTitle == "Salesman")
            {
                Salesman newSM = new Salesman(emp);
                
                return newSM;
            }
              else if(employeeTitle == "ExternalSalesman")
            {
                Salesman newSM = new Salesman(emp);
                
                ExternalSalesman newESM = new ExternalSalesman(newSM);
                
                return newESM;
            }
        }
        else
        {
            System.out.print("You need to log in to use this method");
            return emp;
        }
        return null;
    }
    /*
     * public void setCalenderInfo(int days, int months, int years, Employee employee, String info)
     *  {
     *     employee.employeeCalender.setCalenderInfo(days, months, years, info, safety);
     *  }
     */
}
