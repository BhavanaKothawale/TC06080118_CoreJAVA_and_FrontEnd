package practice;

public class Stud_Record {

	int roll;
	String name;
	int age;
	float score;
	
	public Stud_Record() {};

	public Stud_Record(int roll, String name, int age, float score) 
	{
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	
	if(score<=80 && score==100) 
	{
		System.out.println("roll=" + roll + ", name=" + name + ", age=" + age + ", score=" + score);
	}
	if(score<=65 && score>80) 
	{
		System.out.println("roll=" + roll + ", name=" + name + ", age=" + age + ", score=" + score);
	}
	if(score<=50 && score>65) 
	{
		System.out.println("roll=" + roll + ", name=" + name + ", age=" + age + ", score=" + score);
	}
	if(score<=0 && score>50) 
	{
		System.out.println("roll=" + roll + ", name=" + name + ", age=" + age + ", score=" + score);
	}
	
	
	public static void main(String args[]) 
	{
		Stud_Record s=new Stud_Record(1,"ABC",20,80);
		Stud_Record s1=new Stud_Record(2,"XYZ",21,70);
		Stud_Record s2=new Stud_Record(1,"PQR",20,93);
		Stud_Record s3=new Stud_Record(1,"ACD",20,35);
		Stud_Record s4=new Stud_Record(1,"HGC",21,65);
	}
}
