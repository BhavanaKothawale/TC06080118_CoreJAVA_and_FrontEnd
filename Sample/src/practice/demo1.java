package practice;

public class demo1 {
public static void main (String args[]) {
	int i,j;
	int n=10;
	for(i=0;i<10;i++) {
		
		for(j=0;j<i;j++) {
			System.out.print(" ");
		}
		for(int k=i;k<10;k++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
}
}
