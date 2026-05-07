package operators;

import java.util.Scanner;

public class AmountWithdraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Write a program 
		
		//Intialize account balance with 50000
		//Dispaly the following option:
		     //1) Deposit 2)withdraw 3)check balance
		//Store the use choice in variable
		
		//Deposit 
		    //Ask user to enter deposit amount
		    //If amount is greater than 0-- add to balance
		   //otherwise show "Invalid amount"
		
		//withdraw
		  //Ask use to enter withdraw amount
		  //Allow withdraw only amount>0 and amount<balance
		  //otherwise insufficient balance
		
		//checkbalance
		//Dispaly current account balance
		
		//invalid option
		//if user enter wrong choice __>display "Invalid amount"
		
		
		//Intialize account balance with 50000
		double balance =50000;
		
		//Dispaly the following option:
	     //1) Deposit 2)withdraw 3)check balance
		
		    Scanner sc=new Scanner(System.in);
		    System.out.println("1.Deposit");
		    System.out.println("2.Withdraw");
		    System.out.println("3.check balance");
		    
		   //Store the user choice into the  variable
		    int choice = sc.nextInt();
		    
		   
		    
		  //Deposit 
		    //Ask user to enter deposit amount
		    //If amount is greater than 0 -- add to balance
		   //otherwise show "Invalid amount"
		    
		    
		    
		    if(choice==1)
		    {
		    	
		    	
		    	System.out.println("Enter a deposit amount");
		    	double damount = sc.nextDouble();
		    	
		    	if(damount>0)
		    	{
		    		balance+=damount;
		    		System.out.println("Deposit successfull");
		    		
		    	}
		    	else
		    	{
		    		System.out.println("Invalid amount");
		    	}
		    }
		    
		    
		  //withdraw
			  //Ask use to enter withdraw amount
			  //Allow withdraw only amount>0 and amount<balance
			  //otherwise insufficient balance
		    
		    else if(choice==2)
		    {
		    	
		    	System.out.println("Enter a withdraw amount");
		    	double wamount = sc.nextDouble();
		    	
		    	
		    	if(wamount>0 || wamount<balance)
		    	{
		    		
		    		balance-=wamount;
		    		System.out.println("withdraw succefull");
		    	}
		    	else
		    	{
		    		System.out.println("Insufficient Amount");
		    	}
		    }
		    
		    

			//checkbalance
			//Dispaly current account balance
		    
		    else if(choice==3)
		    {
		    	
		    	System.out.println("The current  balance is  :"+balance);
		    	
		    }
		    
		    else
		    {
		    	
		    	System.out.println("invalid choice");
		    }
		    
		    
		    System.out.println("Final amount : "+balance);

	}

}
