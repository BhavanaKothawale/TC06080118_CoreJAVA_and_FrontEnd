package practice;

import java.util.Scanner;

public class Adding {
public static void main(String args[]) {
	float c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of a=");
	float a=sc.nextFloat();
	System.out.println("Enter value of b=");
	float b=sc.nextFloat();
	c=a+b;
	System.out.println("Addition= "+c);
}

}
