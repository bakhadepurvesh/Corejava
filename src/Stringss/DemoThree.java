package Stringss;

public class DemoThree {
	public static void main(String[] args) {
//		String s ="irise";
//		System.out.println(System.identityHashCode(s));
//		
//		s=s.toUpperCase();
//		System.out.println(System.identityHashCode(s));
//		
//		s=s.toLowerCase();
//		System.out.println(System.identityHashCode(s));
//		
//		System.out.println(s);
		
		String s ="irise";
		String s1="irise";
//		s==s1 > true
//		s.equals(s1) > true
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		s=s.toUpperCase();
		s1=s.toUpperCase();
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		//s.equals(s1) > true
		// s == s1 >
		
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
	}
 
 
}
