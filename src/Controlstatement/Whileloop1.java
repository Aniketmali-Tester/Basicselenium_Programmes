package Controlstatement;

import java.util.Scanner;

public class Whileloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int no = sc.nextInt();
		
		/* ==>Following Syntax for while loop.
                 
                 while (Expression/Condition)
                        
                     {
                            -------     //Java Statements
                            ------     
                     }*/
		
		
		
		
		      while(no>=0)
		      {
		    	  System.out.println("The number is : "+no);
		    	  break;
		      }
		
		
		      


	}

}
