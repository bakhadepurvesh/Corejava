package Array;

public class StuDemo {

	public static void main(String[] args) {
		// private or non -primative 
		
		Student  s = new Student();
		s.setId(101);
		s.setName("ram");
		s.setCity("puna");
		
		Student  s1 = new Student();
		s1.setId(102);
		s1.setName("rama");
		s1.setCity("nagpur");
		
		Student  s2 = new Student();
		s2.setId(103);
		s2.setName("ravi");
		s2.setCity("mumbai");
		
		Student[]studentArray = {s,s1,s2};
		
		  String city ="puna";
		
		for(int i =0; i< studentArray.length ;i++) {
//		  Student studentFromArray =studentArray[i];
			if(studentArray[i].getCity().equals(city)){
			System.out.println(studentArray[i].getId());
			System.out.println(studentArray[i].getName());
			System.out.println(studentArray[i].getCity());
//			System.out.println( studentArray[i]);
			
			}
			
		}
		
	}
	
}
//find a Student who is from pune

// Enter age field, then print students who have age more 18 

