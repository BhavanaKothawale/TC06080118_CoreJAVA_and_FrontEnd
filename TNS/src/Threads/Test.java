package Threads;

public class Test {

	public static void main(String args[]) {
		System.out.println(Thread.currentThread().getName());//main
		System.out.println(Thread.currentThread().getThreadGroup().getName());//main-group
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());//system
		
		ThreadGroup t1=new ThreadGroup("Firstgroup");
		System.out.println(t1.getParent().getName());//main
		ThreadGroup t2=new ThreadGroup(t1,"Secondgroup");
		System.out.println(t2.getParent().getName());//FirstGroup
	}
}
