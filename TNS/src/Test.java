import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import All.Student;

public class Test {
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{ 
		//serialization
		FileOutputStream fos=new FileOutputStream("d://mno.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Student s=new Student(1,"Nikita",9800.0f);
		oos.writeObject(s);
		System.out.println("success");
	    oos.close();
	    fos.close();
	    
	    //deserialization
	    /*ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d://abc.txt"));
	    Student s=(Student) ois.readObject();
        System.out.println(s);
		*/
	}

}
