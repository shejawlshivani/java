package corejava;

public class Employee {
	public void emp_name()
	{
		System.out.println("Shivani");
	}
   }

class department extends Employee{
	public void dep()
	{
		System.out.println("Admin");
	}
}

class state extends department {
	public void state()
	{
		System.out.println("Maharashtra");
	}
} 

class multiinherit{
	public static void main(String[] args)
	{
		state s = new state();
		s.emp_name();
		s.dep();
		s.state();

}
}
