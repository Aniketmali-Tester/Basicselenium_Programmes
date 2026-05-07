package JavaMethods;

public class Parameterized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The method is start");
		areaofcircle(45);

	}
	
	
	//External parameterized
	public static void areaofcircle(double radius)
			 {
		         
		           //A=πr2
		      double areaofradius=3.14*radius*radius;
		      System.out.println("The Radius of the area : "+areaofradius);
	}
	 

}
