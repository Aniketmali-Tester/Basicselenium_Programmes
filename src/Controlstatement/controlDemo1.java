package Controlstatement;

import java.util.Scanner;

public class controlDemo1 {

	public static void main(String[] args) {
		
		
		//Create object for scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int no = scan.nextInt();
		
		
		if(no%2==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}
	

		
		
		
	}

}
