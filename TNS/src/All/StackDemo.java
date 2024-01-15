package All;

import java.util.Stack;

public class StackDemo {
public static void main(String args[]) {
	Stack s=new Stack();
	s.push(10);
	s.push(20);
	s.push("A");
	s.push('B');
	System.out.println(s);
	System.out.println(s.empty());
	System.out.println(s.peek());
	System.out.println(s);
	System.out.println(s.pop());
	System.out.println(s);
	System.out.println(s.search("A"));
	s.push("A");
	System.out.println(s.search("A"));
	System.out.println(s.pop());
	
	System.out.println(s.search("A"));
	System.out.println(s.search('A'));
	
	
	
}
}
