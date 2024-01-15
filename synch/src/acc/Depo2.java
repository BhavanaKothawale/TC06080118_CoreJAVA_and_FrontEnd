package acc;

public class Depo2 extends Thread{

	Deposite d;
	public Depo2(Deposite d) {
		super();
		this.d=d;
	}
	public void run() {
		d.acc();
	}
}
