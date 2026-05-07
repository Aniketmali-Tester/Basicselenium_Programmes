package JavaMethods;

public class staticandnonstatic {

	
	//Internal Method and main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		info();
		persondetails("john", 27, "QA Tester", "Axess", 25000);
		
		 
		
		//object creation
		//classname reference=new classname();
		//reference.methodname();
		
		
		staticandnonstatic ref=new staticandnonstatic();
		ref.add();
		ref.add1(23, 45);
		
		
		
		
	    

   }


   //External Method + Static Method +Non-Parametrized method
   public static  void info()
   {

       System.out.println("Show the person details");
   }

   //External method + Static Method + Parametrized Method
   public static void persondetails(String username,int age,String designation,String companyname,double sal)
   {
       System.out.println("The person name is : "+username);
       System.out.println("The  person age is : "+age);
       System.out.println("The  person designation is : "+designation);
       System.out.println("The  company name is  : "+companyname);
       System.out.println("The  person sal is : "+sal);


   }

   //External Method + Non Static + Non paramerterized
   public void add()
   {
       int a=89;
       int b=98;

       System.out.println("The additional value is : "+(a+b));
   }



   //External Method +non static Method+ parameterized
   public void add1(int a,int b)
   {
       System.out.println("The additional second value is : "+(a+b));
       System.out.println("The Multiplication value is"+a*b);
   }





	}


