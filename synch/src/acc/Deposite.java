package acc;

import java.util.Scanner;

public class Deposite extends Thread {
 
	float a=2000;
	float amount;
	public  Deposite(float amount) {
		
		this.amount=amount;
	}
	public synchronized void acc() {
		
		float temp;
		temp=a;
		temp += amount;
		a = temp;
		
		System.out.println("Total balance= "+a);
		try {
			Thread.sleep(50);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
	}
}
