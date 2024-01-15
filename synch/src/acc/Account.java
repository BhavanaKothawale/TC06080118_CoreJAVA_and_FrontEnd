package acc;

import java.util.Scanner;

public class Account {
	//Scanner sc=new Scanner(System.in);
	float balance=0;
	//Float amount=sc.nextFloat();
	float amount;
	public  Account(float amount) {
		
		this.amount=amount;
	}
	
	
	public synchronized void acc() {
		
		float temp;
		temp=balance;
		temp += amount;
		balance = temp;
		
		System.out.println("Total balance= "+balance);
		//balance+=amount;
	}
	
	public static void main(String args[]) {
		
		for(int i=0;i<5;i++) {
			Scanner sc=new Scanner(System.in);
			float n=sc.nextFloat();
		Account a1=new Account(n);
		a1.acc();
		
		//float sum;
		}
		
		
	}
}
/*
 * Scanner sc=new Scanner(System.in);
	//System.out.println("total transaction: ");
	//int n=sc.nextInt();
	//System.out.println("enter the amount : ");
	//Float i=sc.nextFloat();
	
 */