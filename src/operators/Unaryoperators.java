package operators;

public class Unaryoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10;
		
		
		//post Increment
		
		  a=a++;
		System.out.println("After post increment : "+(a++));//10+1
		System.out.println("After post increment : "+a);//11
		
		
		//preIncerment
		System.out.println("Before Pre Increment : "+(++a));//1+11
		//System.out.println("Before pre Increment : "+a);
		
		
		
		//Post Decrement
		a=a--+a++;
		//System.out.println("After Post Decrement : "+(a--));
		System.out.println("After Post Decrement : "+a);
		
		
		//Pre Decrement
		System.out.println("Berfore pre Decrement : "+(--a));
	}

}
