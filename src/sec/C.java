package sec;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class C{


	
	
	public static void main (String[]args)
	{
Map<Integer,String> si=new TreeMap<Integer,String>();
si.put(1, "arun");
si.put(2,"sasi" );
si.put(3, "taufeeq");

Set<Entry<Integer, String>> q = si.entrySet();
System.out.println(q);

		
}
}