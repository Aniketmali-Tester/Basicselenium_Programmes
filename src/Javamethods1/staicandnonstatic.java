package Javamethods1;

public class staicandnonstatic {
	
	
	
     //	Requirements:
		//Store platform name and GST tax rate (common for all products)
		//Each product should have:
		//product name
		//price
		//quantity
		//Implement:
		//A static method to display platform details
		//A static method to calculate final price with GST
		//A non-static method to display product details
		//A non-static method to calculate total bill for a product

	
	
	//Store platform name and GST tax rate (common for all products)
	  static String platformname="Flipkart";
	  static double GSTRatetax=0.18;
	
	//Each product should have:
			//product name
			//price
			//quantity
	  
	  
	  
	     String productname;
	     double producprice;
	     int quantity;
	     
	     
	     
	   //Implement
	   //A static method to display platform details 
	
	static void Showplatforminfo ()
	{
		
		System.out.println("The platform name is : "+platformname);
		
	}
	
	//A static method to calculate final price with GST
	
	static void calculatefinalprice(double price)
	{
		
		price + (price*GSTRatetax);
	}
	
	//A non-static method to display product details
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
}
