package corejava;

//create class EmployeeData with main method
public class EmployeeData
{
public static void main(String[] args)
{

//create object of Manager class
Manager m = new Manager(126534, "Peter", "Chennai India", 237844, 65000.0);

//call calculateSalary method
double salary =m.calculateSalary();

//print salary
System.out.println("Manager's Salary : "+salary);

//print TransportAllowance
System.out.println("Manager's Transport Allowance (15%) :"+m.calculateTransportAllowance(m, 15));
}
}