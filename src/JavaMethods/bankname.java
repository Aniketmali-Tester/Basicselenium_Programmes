package JavaMethods;

public class bankname {
	
	
	
	public static void Bankname()
	{
		
		System.out.println("HDFC BANK");
	}

	
	
	public void deposit(double amount)
	{
		
		
		System.out.println("Desposited : "+amount);
	}
	
	
	public void name(String name)
	
	{
		
		System.out.println("The name is "+ name);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bankname();
		
		bankname b=new bankname();
		b.deposit(25000.00);
		b.name("aniket");
		

	}

}
