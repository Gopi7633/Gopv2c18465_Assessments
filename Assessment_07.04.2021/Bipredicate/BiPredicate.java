package bipredicate.com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

class Product{
	int id;
	String name;
	int size;
	int laseprice;
	int shocksprice;
	
	public Product(int id, String name, int size, int laseprice, int shocksprice) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
		this.laseprice = laseprice;
		this.shocksprice = shocksprice;
	}
	
}

public class Bipredicate{
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(10, "Puma", 8, 70, 50));
		productList.add(new Product(15, "Spark", 7, 10, 10));
		productList.add(new Product(8, "Puma", 10, 70, 50));
		productList.add(new Product(12, "Spark", 11, 15, 12));
		
		BiPredicate<Integer, Integer> a1 = (lase, shocks)-> ((lase + shocks) >= 50);
		BiPredicate<Integer, Integer> a2 = (lase, shocks)-> ((lase + shocks) <= 50);
		
		System.out.println("Costly Product List : ");
		for (Product s : productList) {
			if (a1.test(s.laseprice, s.shocksprice)) {
				System.out.println("Product Name : " + s.name + " Size " + s.size +
						 " Lase Price : " + s.laseprice + " Shocks Price " + s.shocksprice);
			}
		}
		
		System.out.println("\nCheep Product List : ");
		for (Product s : productList) {
			if (a2.test(s.laseprice, s.shocksprice)) {
				System.out.println("Product Name : " + s.name + " Size " + s.size +
						 " Lase Price : " + s.laseprice + " Shocks Price " + s.shocksprice);
			}
		}
	}
}
