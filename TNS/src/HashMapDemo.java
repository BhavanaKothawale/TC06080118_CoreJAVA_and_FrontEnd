import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
//cannot directely apply iterator to hashmap,for this convert hashmap to set,it is not part of collection,
	public static void main(String args[]) {
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		
		h.put("Bhavana", 1000);
		h.put("vedu", 600);
		h.put("Shree", 700);
		h.put("vicky", 800);
		System.out.println(h);
		
		System.out.println(h.put("vedu", 1200));
		System.out.println(h);
		
		Set s=h.keySet();
		System.out.println(s);//that prints only keys not values
		
		Collection c=h.entrySet();
		System.out.println(c);
		
		Set s1=h.entrySet();
		System.out.println(s1);
		
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry) itr.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
			if(m1.getKey().equals("Bhavana")) {
				m1.setValue(1600);
			}
		}
		System.out.println(h);
		
	}
}
