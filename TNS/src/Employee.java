
public class Employee {

	int emp_id;
	String emp_name;
	
	public Employee() {}
	public Employee(int emp_id, String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
	}
	
	public static void main(String args[]) {
		Employee e=new Employee(1,"bhavana");
		Employee e1=new Employee(3,"vedu");
		Employee e2=new Employee(2,"abhi");
		System.out.println(e2.toString());
	}
	
	
}
