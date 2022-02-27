package ecomdemo;
import java.util.List;

public class Main {
	public static void main(String args[]) {	
		Services sere = new Services();
        List<Product> productlist = sere.getListOfAllProducts();
		for (Product newlist : productlist) {
			System.out.println("size is: " + newlist.getScreensize());
	        System.out.println("Name is: " + newlist.getLaptopName());
			System.out.println("model is: " + newlist.getModel());

		}
	}

}
