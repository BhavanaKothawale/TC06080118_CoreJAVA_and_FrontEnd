package acc;

import java.util.Scanner;

public class Test1 {

	public static void main(String args[]) {
		Deposite d=new Deposite(50);
		Deposite d1=new Deposite(200);
		Depo1 t1=new Depo1(d);
		Depo2 t2=new Depo2(d1);
		Depo1 t3=new Depo1(d);
		Depo2 t4=new Depo2(d);
		t1.start();
		t2.start();
		t3.start();
		t4.start();	
		
	}
}
