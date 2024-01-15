package practice;

public class Info {

	int roll;
	String name;
	int age;
	float score;
	
	public Info() {}

	public Info(int roll, String name, int age, float score) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	
	
     @Override
	public  String toString() {
		return "Info [roll=" + roll + ", name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	public static void main(String args[]) {
    	 Info i1=new Info(1,"ABC",20,80);
    	 Info i2=new Info(2,"XYZ",21,70);
 		Info i3=new Info(1,"PQR",20,93);
 		Info i4=new Info(1,"ACD",20,35);
 		Info i5=new Info(1,"HGC",21,65);
 		System.out.println(i5.toString());
 		System.out.println();
	}
}
