
public class ManagerStaffAssociation extends Employee
{
    // instance variables 
    /**
     * Constructor for objects of class managerStaffAssociation
     */
    public ManagerStaffAssociation(Employee employee)
    {
      super(employee.name, employee.accountNumber, employee.salary, employee.address, employee.phoneNumber, employee.employeeID, employee.password);
        
    }
}
