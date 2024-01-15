import java.util.TreeSet;

public class TreeDemo {
//for decending order we can create Comparator interface
	public static void main(String args[]) {
		/*
		TreeSet<Integer> t=new TreeSet<Integer>(new MyComparator());
		t.add(10);
		t.add(5);
		t.add(15);
		t.add(0);
		System.out.println(t);
		*/
		TreeSet<String> t=new TreeSet<String>(new MyComparator());
		//TreeSet<String> t=new TreeSet<String>(new MyComparator().reversed());
		t.add("Abhi");
		t.add("nikita");
		t.add("Bhavana");
		t.add("bhavana");
		//t.add("A");
		System.out.println(t);
		
	}
	
	//write a program to insert string object into the Treeset where sorting order is alphabetical order
	//reverse the alphabetical order
	
	
	
}
