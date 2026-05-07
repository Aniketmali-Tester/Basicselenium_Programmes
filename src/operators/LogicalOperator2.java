package operators;

public class LogicalOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=20;
		int b=15;
		
		   // 19 + 16 + 20 + 20 =75
		b=  --a + ++b + ++a + a;
		
		System.out.println("The B value is : " +b);//75
		System.out.println("the value of A is : "+a);//20
		
		//int a1 = 0;
		    //76<50 || 19>20  &&  75>40 ||  20>20
		if((++b<50 || --a>20) && (--b>40 || ++a>20))
		{
			
			a++;
			b--;
			
		}
		
		System.out.println("After increment a value is :"+a);//21
		//System.out.println("The After increment a1 value is : "+a1);
		System.out.println("After Decrement b value is : "+b);//74

	}

}
