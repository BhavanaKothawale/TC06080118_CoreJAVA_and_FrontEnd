package Threads;

class A{
	private void printName() {
		System.out.println("value a");
	}
}

class B{
	void printName() {
		System.out.println("value b");
	}
}

public class Test4 {

	public static void main(String args[]) {
		B b = new B();
		b.printName();
	}
}
