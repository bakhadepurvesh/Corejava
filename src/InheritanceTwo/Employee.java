package InheritanceTwo;

public class Employee {
	
	public Employee() {
		super();
		System.out.println("Const - employee");
		// TODO Auto-generated constructor stub
	}
	
	int empId=102;
	
	static int abc=1234;
	String name="Vijay";
	
	
	public static void printVehical() {
		System.out.println("Honda"); 
	}
	public void printCity() {
		System.out.println("City Name");
	}
    public void printSalary() {
		System.out.println("2500");
	}
}
