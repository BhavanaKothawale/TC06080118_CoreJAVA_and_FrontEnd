package collection;

import java.util.*;
public class Demo1 {
	
	public static void main(String args[]) {
		
		int no=10;
		Integer i= new Integer(no);//boxing
		int a=i.intValue();//unboxing
		
		int b=100;
		Integer m=b;
		int c=m;
		
		List<Integer> l= new ArrayList<Integer>();
		l.add(10);
		l.add(45);
		l.add(null);
		//l.add("abc");
		System.out.println(l);
		l.add(2, 34);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		
		System.out.println(l.contains(10));
		System.out.println(l.contains(34));

		List l1=Collections.synchronizedList(l);
		
	}

}
/*
*/