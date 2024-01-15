package practice;
import practice.Info;
public class Score extends Info {
	public void score() {
	if(score<=80 && score==100) 
	{
		System.out.println("roll=" + roll + ", name=" + name + ", age=" + age + ", score=" + score);
	}
	else if(score<=65 && score>80) 
	{
		System.out.println("roll=" + roll + ", name=" + name + ", age=" + age + ", score=" + score);
	}
	else if(score<=50 && score>65) 
	{
		System.out.println("roll=" + roll + ", name=" + name + ", age=" + age + ", score=" + score);
	}
	else (score<=0 && score>50) 
	{
		System.out.println("roll=" + roll + ", name=" + name + ", age=" + age + ", score=" + score);
	}
	}
	
	public static void main(String args[]) {
		
	}
}
