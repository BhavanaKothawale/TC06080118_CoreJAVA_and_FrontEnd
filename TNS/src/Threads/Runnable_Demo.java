package Threads;

public class Runnable_Demo implements Runnable {

	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String args[]) {
		Runnable_Demo m1= new Runnable_Demo();//born state
		Thread t1=new Thread(m1);
		Runnable_Demo m2= new Runnable_Demo();
		Thread t2=new Thread(m2);
		Runnable_Demo m3= new Runnable_Demo();
		Thread t3=new Thread(m3);
		
		t1.start();//runnable state- waiting in queue in order to acquire resources
		t2.start();
		t3.start();
		
	}
}
