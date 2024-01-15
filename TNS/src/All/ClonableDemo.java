package All;


import java.io.Serializable;


public class ClonableDemo implements Cloneable{
	private int rollno;
	private transient String name;
	private transient float fees;
	
	public ClonableDemo(){}

	public ClonableDemo(int rollno, String name, float fees) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", fees=" + fees + "]";
	}
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Student s=new Student(2,"Abhi",7689.00f);

		System.out.println(s);
		
	}
}
