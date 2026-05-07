package Controlstatement;

import java.util.Scanner;

public class Decisioniifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter your age");
	     int age = scan.nextInt();
	     
	     
		    
	 //18>=18   
	 if(age>=18)
	 {
		 
		    System.out.println("your Eligible for the vote");
	 }
		    
	 else
    {
    	
    	
    	 System.out.println("your not eligible for the vote");
    }
		    
		    
		    
	}

}
