package Inheritance;

//child
public class Tiger extends Animal{
	
	// variable 
	 int b = 23;
	 int a =100;
	
	public Tiger() {
	System.out.println("In tiger constructor - child");
    }

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		super.printName();
		System.out.println("Tiger");
	}
	
	public void printColor() {
		System.out.println("yellow black stripped");
	}
	
}
