package practice;

public class demo2 {
	public static void main (String args[]) {
		int i,j;
		int n=5;
		for(i=1;i<=n;i++) {
			
			for(j=1;j<=n-i;j++) {
				System.out.print("1");
			}
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("2");
		}
	}
}
