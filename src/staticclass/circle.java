package staticclass;


//Business Logic class
public class circle {
	
	
	 //Static Data Member
	 static double pi=3.14;
	 
	 
	 //Area
	static void area(double r)
	 {
		 
		 double area = pi*r*r;
		 System.out.println("The Area Value Is : "+area);
	 }
	 
	 //Circumference
	 void circumferencr(double r)
	 {
		 
		 double circumf = 2*pi*r;
		 System.out.println("The circumference value is : "+circumf);
	 }

}
