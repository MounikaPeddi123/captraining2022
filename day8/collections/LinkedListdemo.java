package collections;

import java.util.LinkedList;

public class LinkedListdemo {
	
		public static void main(String[] args) {
			LinkedList<String> linklistdemo=new LinkedList<String>();
			linklistdemo.add("Mango");
			linklistdemo.add("Banana");
			linklistdemo.add("nuts");
			linklistdemo.add("Kiwi");
			linklistdemo.add("Orange");
			linklistdemo.add("apple");
			linklistdemo.add("apple");
			linklistdemo.add("apple");
			for (String fruits:linklistdemo) {
				System.out.println("list of fruit "+fruits);
				
			}
			linklistdemo.add("PAPAYA");
			linklistdemo.add("JACKFRUIT");
			System.out.println("After adding elements.....");
			for (String fruits : linklistdemo) {
				System.out.println("list of fruits "+ fruits);
			}
				
		}

	}





