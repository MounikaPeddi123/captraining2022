package collections;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> demo =new LinkedHashSet<String>();
	    demo.add("apple");
		demo.add("mango");
		demo.add("banana");
		demo.add("nuts");
		demo.add("apple");
		demo.add("apple");
		demo.add("mango");
		demo.add("null");
		demo.add("null");
		Iterator iterator =demo.iterator();
		if (iterator!=null) {
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
		
		
	}

}
