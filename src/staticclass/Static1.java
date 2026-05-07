package staticclass;

public class Static1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Method");
		
		
		
		//====================================================
		
		//Access Non static Function Member
		sample sa=new sample();
		sa.info();
	
			
		
	   //Access Static Method 
		demo.info();
		
		
		
		
	}

}



//============================================================


class demo
{
	
	
	 //WAP To Demonstrate Execution of Static data memeber and  
	 //Static Function Memeber and Declare Inside The class?
	
	
	   //Static Data Member
	      static char ch='q';
	      
	      
	      //Static Function Member
	      
	      static void info() {
	    	  
	    	  System.out.println("The char value is : "+ch);
	    	  System.out.println("Info Static Method");
	    	  
	    
	      }
	      	      
}


class sample
{
	
	
	//non-Static Data Member
     char c='q';
    
    
    //Non -Static  Function Member
    
     void info() {
  	  
  	  System.out.println("The char value is : "+c);
  	  System.out.println("Info Non Static Info Method");
  	 	
	
}
}