package Controlstatement;

import java.util.Scanner;

public class controlstatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter qty");
		double qty = scan.nextDouble();
		
		
		System.out.println("Enter a price");
		double price = scan.nextDouble();
		calculate(qty, price);

	}
	
	
	   public static void calculate(double q,double p)
	   {
		   double totalamount = q*p;
		   
		   System.out.println("The Total amount is : "+totalamount);
		   
		       // 2001 >=2000
		   if(totalamount>=2000)
		   {
			   System.out.println("The After 10% discount total amount is "+totalamount*0.9);
		   }
		          //1999<2000
		   else //(total<2000)
		   {
			   
			   System.out.println("The After 5% discount  total amount is "+totalamount*0.95);
		   }
		  // else
		  // {
			   
			   //System.out.println("Better for Next Time ");
		   //}
		   
		     }
	   
	 }
