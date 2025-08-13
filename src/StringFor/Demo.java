package StringFor;

public class Demo {
//public static void main(String[] args) {
//	String day ="Monday";
//     //	System.out.println(day);
//	 int length = day.length();
//	 //System.out.println(length);
//	 
//	 for(int i=0;i<day.length()-3;i++){
//		 char c = day.charAt(i);
//		 System.out.println(day.charAt(i));
//	 }
	
//public static void main(String[] args) {
//	
//	String day ="Monday";
////	System.out.println(day);
//	 int length = day.length();
//	System.out.println(length);
//	 
//	 for(int i=0;i<day.length();i++){
//		 if(i%2==0){
////			char c = day.charAt(i);
//			System.out.println(day.charAt(i)); 
//		 }
//	 }
	
	
	public static void main(String[] args) {
		
		String day ="Monday";
//		System.out.println(day);
		 int length = day.length();
		System.out.println(length);
		 
		 for(int i=0;i<day.length();i++){
			 
			 if(day.charAt(i)!='a'&& day.charAt(i)!='e'&&day.charAt(i)!='i'&& day.charAt(i)!='o'&& day.charAt(i)!='u'){
//				char c = day.charAt(i);
				System.out.println(day.charAt(i)); 
			 }
		 }
}
}
