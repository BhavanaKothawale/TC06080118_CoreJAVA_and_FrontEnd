package All;
import java.util.Enumeration;
import java.util.Vector;
public class VectorDemo {
	public static void main(String args[])
	{
		//vector
		Vector<Integer> v=new Vector(); 
		for(int i=1;i<9;i++)
		{
			v.addElement(i);
		}
		System.out.println("Capacity="+v.capacity());
		System.out.println(v);
		System.out.println("Size="+v.size());
		
		
		//Enumeration 
		Enumeration<Integer> e= v.elements();
		while(e.hasMoreElements())
		{
			int i=e.nextElement();
			if(i%2==0)
			{
				System.out.println(i);
				
			}
			//else
			//e.remove();
			//v.remove(i);
		}
		System.out.println(v);
		
		
	}

}
