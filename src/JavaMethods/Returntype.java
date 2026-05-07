package JavaMethods;

public class Returntype {
	
	
	
	public static int addition()
	{
		
	int a=45;
	int b=25;
	
	int c=a+b;
	
	return c;
		
		
	}
	
	
	public static String name()
	{
		
		String name="aniket";
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     
		             int newvalue = addition();
		             System.out.println("The Addtional number Is :"+ newvalue);
		             
		             String newname = name();
		             System.out.println("The name is : "+ newname);

	}

}
