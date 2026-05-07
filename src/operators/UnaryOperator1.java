package operators;

public class UnaryOperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//post Increment and pre Decrement
		
		int p=4;
		int q=6;
		
		
		
		System.out.println("The p value is : "+p);//4
		System.out.println("The Q value is : "+ q);//6
		
		//Re-Intilization of q value
		   
		  //4+1
		q=p++;
		System.out.println("The After Increment  p value is : "+ p);//5
		System.out.println("The After RE-intilization  q value is : "+q);//4
		
		
		  //5+4
        q=p+++q;//10
        System.out.println("The vlaue is  P + Q value is : "+q);//
        System.out.println("The p vlaue is ; "+p);//6
        
          //6+9+7
        q=p+++q+++p;
        System.out.println("The value of p and q is : "+q);//22
        
        System.out.println("the vlaue of p is :"+p);//7
        
	}

}
