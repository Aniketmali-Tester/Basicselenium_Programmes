package JavaMethods;

public class Parameterized1 {

	public static void   main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		
		System.out.println("This Is Arithimetic");
		add(23, 45, 55);
		sub(56,45);
		div(2, 3);
		end();
	}	
		
		public static Object add(double A,double b,double c)
		{
			
			
			 System.out.println(A+b+c);
			return a;
		}
		
		public static  sub(double A,double B)
		{
			
			System.out.println(A-B);
			
		}
		public static void div(double A,double b)
		{
			System.out.println(A/b);
			
			
		}
		
		public static void end()
		{
			System.out.println("This is End");
			
		}

	}


