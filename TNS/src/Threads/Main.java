package Threads;

class Base{
	final public void show() {
		System.out.println("called");
	}
}

class Derived extends Base{
	  public void show() {
		System.out.println("called 12");
	}
}
public class Main {

	public static void main(String args[]) {
		Base b = new Base();
		b.show();
	}
}
