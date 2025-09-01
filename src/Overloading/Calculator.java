package Overloading;

//overloading -> compile time polymorphism
public class Calculator {
	
	
	// constructor overloading
	public Calculator() {
		
	}
	
	public Calculator(int a) {
		
	}
	
	public Calculator(int a, int b) {
		
	}
   //
	
	
	
	
	
	
	
	
	
//example 1
public void addition(int a , int b) {	
	int sum =a+b;
	System.out.println(sum);
}	

// return type , access modifier wont in overloading
//protected void addition(int x , int y) {
//	int sum =x+y;
//	System.out.println(sum);
//}

public void addition(int a , int b , int c) {
	int sum =a+b+c;
	System.out.println(sum);
}	

//example 2

public void addition(String name,int v) {
	
}

public void addition(int v,String name) {
	
}
}
