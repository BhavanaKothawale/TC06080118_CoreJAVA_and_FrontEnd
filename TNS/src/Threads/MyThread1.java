package Threads;

public class MyThread1 extends Thread {

	public void run() {
		//resource----running
		System.out.println(Thread.currentThread().getName()+
				" "+Thread.currentThread().getPriority());
		
	}
	public static void main(String args[]) {
		MyThread1 t1= new MyThread1();//born state
		MyThread1 t2= new MyThread1();
		MyThread1 t3= new MyThread1();
		
		t1.setName("a");
		t2.setName("b");
		t3.setName("c");
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		
		t1.setPriority(4);
		//t1.stop();
		t1.start();//runnable state- waiting in queue in order to acquire resources
		t2.start();
		t3.start();
		
	}
}
