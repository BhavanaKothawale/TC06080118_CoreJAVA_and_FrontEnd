import java.util.Hashtable;

public class HahTableDemo {
public static void main(String args[]) {
	Hashtable h=new Hashtable();
	h.put(new Temp(5), "A");
	h.put(new Temp(2), "B");
	h.put(new Temp(6), "C");
	h.put(new Temp(15), "D");
	h.put("a", 50);
	System.out.println(h);
}
}
