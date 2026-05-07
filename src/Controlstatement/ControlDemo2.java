package Controlstatement;

import java.util.Scanner;

public class ControlDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		
		if(num>0)
		{
			
			if(num%3==0)
			{
				
				System.out.println("Number is Positive  as well it's divisible by 3");
			}
			
			else
			{
				
				System.out.println("Number is positive and not divisible by 3");
			}
		}
		
		else
		{
			if(num%7==0)
			{
				
				System.out.println("Number is negative as well it's divisible by 7");
			}
			
			else
			{
				
				System.out.println("Number is negative but not divisible by 7");
			}
			
		}

	}

}
