package collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class LinkedHashMapdemo {
	public static void main(String[] args) {
		Map<Integer, String> map =new LinkedHashMap<Integer, String>();
		map.put(1, "Ram");
		map.put(2, "Sham");
		map.put(3, "Arnav");
		map.put(4,"john");
		Set set =map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr.next();
			System.out.println("Key--->"+entry.getKey() + "value-->" + entry.getValue());
		}
		
	}

}
