package Threads;

public class MyThread extends Thread{

	public void run() {
		//resource----running
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId()
				+" "+Thread.currentThread().getPriority());
		//System.out.println(Thread.MAX_PRIORITY);
		//System.out.println(Thread.MIN_PRIORITY);
	}
	public static void main(String args[]) {
		MyThread t1= new MyThread();//born state
		MyThread t2= new MyThread();
		MyThread t3= new MyThread();
		
		t1.start();//runnable state- waiting in queue in order to acquire resources
		t2.start();
		t3.start();
		
		//total 5 threads are running 
		//1-garbage collector thread
		//2-main thread     and total 3 that we have created
		
	}
}
