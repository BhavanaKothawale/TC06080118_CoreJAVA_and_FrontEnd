package acc;

public class Depo1 extends Thread {

	Deposite d;
	public Depo1(Deposite d) {
		super();
		this.d=d;
	}
	public void run() {
		d.acc();
	}
	
	
}
