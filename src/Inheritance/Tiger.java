package Inheritance;

//child
public class Tiger extends Animal{

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		super.printName();
		System.out.println("Tiger");
	}
	
	public void printColor() {
		System.out.println("yellow black");
	}
	
}
