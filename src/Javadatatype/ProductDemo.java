package Javadatatype;

public class ProductDemo {

	public static double main(String[] args) {
		
		//create variable and store prices in variable each product price
		//add all product price and display the total amount
		//Apply 10% discount on totalmount
		
		//create variable and store prices in variable each product price
		double product1price = 55000.65;	
		double product2price = 55000.00;	
		double product3price = 55000;	
		double product4price = 56000.36;	
		double product5price = 57000.75;	
		
		
		
		
		//add all product price and display the total amount
		double totalamount = product1price+product2price+product3price+product4price+product5price;
		
		return totalamount;
		
		System.out.println("The total amount is : "+totalamount);
		
		
		
		//Apply 10% discount on totalmount
		double discountamount = totalamount*0.1;
		
		System.out.println("After discount amount is : "+discountamount);
		
		
		double finalamount=totalamount-discountamount;
		
		System.out.println("Final amount is : "+finalamount);
		
		

	}

}
