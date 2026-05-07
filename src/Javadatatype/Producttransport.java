package Javadatatype;

public class Producttransport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Store product mrp,gst percentage,transport cost
		//Apply 10% dealership comission
		//display final cast to user
		
		

		//Store product mrp,gst percentage,transport cost
		  
		double productprice=2500;
		double GSTpercentage=0.03;
		int Transportcost = 75;
		
		
		
		       
		 double gstamount = productprice*GSTpercentage;
		 System.out.println("After Apply GST amount is : "+gstamount);
		 
		  double totalamount = gstamount+Transportcost;
		  
		//Apply 10% dealership comission
		  
		  double amount = totalamount*10.1;
		  double finalamount = totalamount+amount;
		  
		  
		//display final cast to user
		  System.out.println("cost of user : " +finalamount);
		  System.out.println("cost of Dealer : " +amount);
		
 
	}

}
