package JavaMethods;

public class method3 {
	
	
	//Non-parameterized method
	
	public static void multiply1()
	{
		int a=30;
		int b=48;
		
		System.out.println(a*b);
	}
	
	//External Parameterized method
	public static void multiply(int a,int b)
	{
		
		
		System.out.println(a*b);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		   System.out.println("the program starts here");
		   multiply(30, 48);
		   multiply1();
		   

	}

}
