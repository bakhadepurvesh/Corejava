package StringFor;

import java.util.Scanner;

public class UserNameCreator {
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name");
	String name =sc.next();
	System.out.println("Enter lastname");
	String lastname =sc.next();
	System.out.println("Enter year");
	int year =sc.nextInt();
	
	String result ="";
	result=result+lastname.charAt(0);

	for(int a=0;a<name.length()-2;a++) {
		result = result+name.charAt(a);
	}
	int num =year%100;
	 result = result+num;
	System.out.println(result);
    }
}

//UserNameCreator
//Scanner
//name - String - Michael
//lastname - String -Perlin
//year of birth - int - 1985

//output
//PMich85
