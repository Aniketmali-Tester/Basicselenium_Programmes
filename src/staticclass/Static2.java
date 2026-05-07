package staticclass;

import java.util.Scanner;

public class Static2 {
	
	
//Executable class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Select mode");
		System.out.println("1.Area 2.Circumference" );
	    int choice = sc.nextInt();
	    circle c=new circle();
	   
	     
	     
	     System.out.println("Enter your radius");
	     double rad = sc.nextDouble();
	     
	     
	     if(choice==1)
	     {
	    	 
	    	 circle.area(rad);
	    	 
	    	 
	     }
	     else if (choice==2)
	     {
	    	 
	    	 c.circumferencr(rad);
	    	 
	     }
	     else
	     {
	    	 
	    	 System.out.println("Invalid choice");
	     }
		

	}

}
