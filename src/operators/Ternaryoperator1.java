package operators;

import java.util.Scanner;

public class Ternaryoperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//select colour
		//1)Red 2)Green 3)Blue
		
		//choice=
		//msg
		//without using if else
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter a color");
		System.out.println("1.Red");
		System.out.println("2.Green");
		System.out.println("3.Blue");
		
		int choice = sc1.nextInt();
		
		
		// Variable=(conditions...n)? "exp1 " : "exp2";
		
	String result = (choice==1)?"Red":(choice==2)?"Green":(choice==3)?"Blue":"Invalid";
	System.out.println("The colour is  "+result);

		

	}

}
