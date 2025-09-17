package AbstractClass;


import AbstractClass.Employee;
import AbstractClass.HR;
import AbstractClass.Manger;

public class Demo {

		public static void main(String[] args) {
			
			String value ="manger";
			
			// reference class or variable
			Employee e;
			
			if(value.equalsIgnoreCase("manger")){
				e = new Manger();
				e.printSalary();  
			}
			else {
				e = new HR();
				e.printSalary();
			}	
		}
		
	}

 // new style of to make constructor
//		Employee e ;
//		e = new HR();
//		e.printSalary();



