package JavaMethods;

public class staticandnonstaticmethod {

	
	
	//External Methods && Static method
	public static void systeminfo()
	{
		
		
		System.out.println("Login System started");
	}
   
	
	//Non-static method 
	  public void username(String username,int age )
	  {
		  
		  System.out.println("Username :  "+username +" Age : " +age);
		  
		  
	  }
	  
	  
	  public double salary(double sal,double inc)
	  {
		  
		        double f= sal+inc;
		       // System.out.println("The final sal is : "+f);
		        return f;
		        
		  
		  
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	     systeminfo();
	     
	     //create object for non static method access
	     staticandnonstaticmethod s=new staticandnonstaticmethod();
	     s.username("Aniket",27);
	     s.username("Sankar", 26);
	     s.username("john", 30);
	     
	     staticandnonstaticmethod s1=new staticandnonstaticmethod();
	     s1.username("Gokula",25);
	     
	     staticandnonstaticmethod s3=new staticandnonstaticmethod();
	     double d = s3.salary(25000.68, 50000);
	     
	     System.out.println("The Fianl salary is : "+d);
	     
	     staticandnonstatic ref=new staticandnonstatic();
	     ref.add();
	     ref.add1(25, 25);
	     
	     
	     
	     
         
	}

}
