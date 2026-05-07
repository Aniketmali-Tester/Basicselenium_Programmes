package JavaScanner;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your quantity");
		int quan = scan.nextInt();
        
		System.out.println("please provide a price");
		double price = scan.nextDouble();
		
		calculatebill(quan, price);
	}

	
	//External method +static method +parameterized method
	public static void calculatebill( int q, double p)
	{
		   double totalamount = q*p;
		   System.out.println("The total amount is : "+totalamount);
		
		
	}
}
