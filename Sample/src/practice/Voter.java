package practice;

import java.io.IOException;
import java.util.Scanner;

public class Voter {

	int voterid;
	String name;
	static int age;
	
	Voter(){}

	public Voter(int voterid, String name, int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("invalid age for voter");
		}
	
		
		this.voterid = voterid;
		this.name = name;
		this.age = age;
	}
	
	class InvalidAgeException extends Exception{
		public InvalidAgeException(String message) {
			super(message);
		}
	}
	
	
	

	@Override
	public String toString() {
		return "Voter [voterid=" + voterid + ", name=" + name + "]";
	}

	public static void main(String args[]) throws IOException, InvalidAgeException {
	/*
		Scanner sc=new Scanner(System.in);
	System.out.println("ID");
	int voterid=sc.nextInt();
	System.out.println("NAME");
	String name=sc.next();
	System.out.println("AGE");
	int age=sc.nextInt();
	
	*/
		Voter v1=new Voter(1,"bhavna",21);
		Voter v=new Voter(1,"bhavna",30);
	v1.toString();
	v.toString();
	
	
	}
	
	
}

/*
 * create a class voter(voterid,name,
 * 
 * 
 */
