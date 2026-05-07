package JavaMethods;

public class Internalmethod {

	
	
	//Internal Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("This main method");
		demo();
		System.out.println("Main End method");

	}
	
	
	//External Method
	public static void demo()
	{
		
		run();
		System.out.println("This External Method");
	}
	
	
	public static void run()
	{
		
		
		System.out.println("This External Second Method");
	}

}
