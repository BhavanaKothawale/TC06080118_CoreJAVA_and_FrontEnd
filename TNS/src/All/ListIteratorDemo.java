package All;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
public static void main(String args[]) {
	LinkedList<String> l=new LinkedList<String>();
	l.add("Nikita");
	l.add("Abhi");
	l.add("Mayuri");
	l.add("kiran");
	System.out.println(l);
	ListIterator<String> itr=l.listIterator();
	//Next
	/*
	while(itr.hasNext())
	{
		String str=itr.next();
		if(str.equals("Nikita"))
				{
			         itr.set("Pooja");
				}
		if(str.equals("Mayuri"))
		{
			itr.add("neha");
		}
		
	}
	System.out.println(l);
	*/
	//previous
			while(itr.hasPrevious())
			{
				String str=itr.previous();
				if(str.equals("Abhi"))
					{
				         itr.set("Raj");
					}
				
			    if(str.equals("Mayuri"))
			        {
			    		itr.add("Shital");
			        }
			    
			}
				System.out.println(l);
	
	
}
}
