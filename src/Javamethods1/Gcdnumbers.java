package Javamethods1;

public class Gcdnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=48;
		int b=20;

		int result = step1(a, b);
		System.out.println("The Final result is : "+result);
		 
	}
	
	
	public static int step1(int a ,int b)
	{
			
		                      //Step 1  (a,b)
		int r = a%b;         //step1 → (48,20) → r = 8
		return step2(b, r);  //(20,8)
	}
	
    public static  int step2(int b,int r)
    {
    	
    	
    	int r1=b%r;              //Step2(20,8)--r=4
    	                        //return step3(b,r);        //(8,4)
    	return r1;
    }
    
    
    public static int step3(int a,int b)      //Step3
    {
    	
    	int r=a%b;
    	return step4(b,r);
    }
    
    public static int step4(int a,int b)
    {
    	
    	
    	int r=a%b;
    	return step5(b,r);
    }
    
    public static int step5(int a,int b)
    {
    	return a;
    }
}
