package Javamethods1;

public class LCM {


		 public  static int step1(int a, int b) {
		        int r1 = a % b;
		        System.out.println("The value of remainder r1 is : "+r1);
		        return step2(b, r1);
		    }

		 public  static int step2(int b, int r1) {
		        int r2 = b%r1;
		        int LCM;
			   //return step3(b, r2);
		        System.out.println("The value of remainder is r2 :"+r2);
		        LCM=(48 * 20) /0;
		        return LCM;
		    }

		   public static int step3(int b, int r2) {
		        int r3 = b%r2;
		        //return step4(b, r3);
		     //return (12 * 18) / r3;
		       
		    }

		   public  static int step4(int b , int r3) {
		        int r4 = b%r3;
		        return step5(b, r4);
		    }

		  public  static int step5(int a, int b) {
		        // assume final value reached (fixed case)
		        return (12 * 18) / 6;
		    }

		    public static void main(String[] args) {
		    	
		    	int a=12;
		    	int b=48;
		          int lcm = step1(a, b);
		          System.out.println("The LCM Value is : "+lcm);
		    }
		}
		
	

