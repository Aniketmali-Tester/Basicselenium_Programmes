package operators;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//purchase>1000 or customer is premium.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a purache amount : ");
		double amount = sc.nextDouble();
		
		
		
		System.out.println("Is premium customer (true/false):: ");
	    boolean premium = sc.nextBoolean();

	    
	    
	    if(amount>=1000 || premium)
	    {
	    	
	    	System.out.println("You have Discount");
	    }
	    else
	    {
	    	System.out.println("No Discount");
	    }
	}

}
