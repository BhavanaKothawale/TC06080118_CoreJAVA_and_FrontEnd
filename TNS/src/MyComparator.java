import java.util.Comparator;

public class MyComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		//return s2.compareTo(s1);//decending order
	return s1.compareTo(s2);//Acending order
	//return -s1.compareTo(s2);decending
	}


/*
	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		if(i1<i2)
			return +1;
		else if(i1>i2)
			return -1;
		else
		return 0;
	}
*/	
	
}

//
