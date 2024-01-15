//insertion order is preserved in linkedhashset

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String args[]) {
		HashSet h=new HashSet();
		h.add(10);
		h.add("A");
		h.add(2);
		h.add(10.2f);
		//h.add(null);
		//System.out.println(h.add(2));
		System.out.println(h);
	}
}
