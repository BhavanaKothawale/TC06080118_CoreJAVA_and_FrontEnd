package Exception;
import java.io.*;
public class Demo1 {

	public static void main(String args[]) throws IOException {
		FileOutputStream fos = null;
		try {
			System.out.println("In try");
			fos= new FileOutputStream("C:\\Users\\DELL\\Documents\\bhavana.txt",true);
			fos.write(97);
			String str=" JSPM Engineering college";
			byte b[]=str.getBytes();
			fos.write(b);
		}
		catch(Exception e) {
			System.out.println("In catch");
			System.out.println(e);
		}
		finally {
			System.out.println("In finally");
			fos.close();
		}
	}
}
