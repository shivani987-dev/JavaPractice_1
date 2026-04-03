package basic;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name :");
		String name = sc.next();
		
		System.out.println("enter your age :");
		int age = sc.nextInt();
		
		System.out.println("enter your gender :");
	    char gender = sc.next().charAt(0);
	    
	    System.out.println("enter your phone no :");
	    long phoneNo = sc.nextLong();
	    
	    System.out.println("---------------------------------------------------------------");
	    

	    System.out.println("Name :"+name);
	    System.out.println("Age :"+age);
	    System.out.println("Gender :"+gender);
	    System.out.println("Phone No. :"+phoneNo);
	}

}
