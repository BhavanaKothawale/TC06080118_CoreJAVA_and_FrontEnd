package All;
import java.io.Serializable;

public class Student implements Serializable {
	private int rollno;
	private transient String name;
	private transient float fees;
	
	public Student(){}

	public Student(int rollno, String name, float fees) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", fees=" + fees + "]";
	}
	

}
