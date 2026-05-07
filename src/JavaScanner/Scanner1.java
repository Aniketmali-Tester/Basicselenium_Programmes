package JavaScanner;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please Enter your name ");
		String name = scan.next();
		System.out.println("Your name is : "+name);
		
		
		System.out.println("please enter your empid ");
		int empid = scan.nextInt();
		System.out.println("Youe emp id is : "+empid);
		
		
		System.out.println("Please enter your designation");
		String des = scan.next();
		System.out.println("Your designation is : "+des);
		
		
		System.out.println("Enter Your salary ");
		double sal = scan.nextDouble();
		System.out.println("Your salary is : "+sal);

	}

}
