package operators;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 //Syntax::
             
            // Variable=(conditions...n)? "exp1 " : "exp2";

                                         // if        else
		
		
		Scanner sc=new Scanner(System.in);
	     System.out.println("please Enter a  number");
	     int no = sc.nextInt();
	     
	     String result = (no>0)?"positive":"negative";
	     System.out.println("The number is : "+result);
                                       

	     
	     

	}

}
