import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String args[]) {
		//accending order is natural sorting order
		//decending order is customized sorting order
		TreeSet t=new TreeSet();
		
		//string class is internally implemented using comparable interface
		t.add("A");
		t.add("B");
		t.add("a");
		t.add("z");
		t.add("c");
		System.out.println(t);
		
		//t.add(null);//nullpointerexception. cannot invoke java.lang.comparable because it is null
		//t.add(10);//classcastexception
		/*
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("A"));
		
		System.out.println(t);
		*/
	}
}
