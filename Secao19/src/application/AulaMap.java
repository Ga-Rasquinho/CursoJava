package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import services.ProductMap;

public class AulaMap {

	public static void main(String[] args) {
		
/*		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "9771122");
				
		cookies.remove("email");
		cookies.put("phone", "2345678");
		
		System.out.println("contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("All Cookies: ");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}*/
		
		
		
		//Outro exemplo de Map
		
		Map<ProductMap, Double> stock = new HashMap<>();
		
		ProductMap p1 = new ProductMap("Tv", 900.0);
		ProductMap p2 = new ProductMap("Notebook", 1200.0);
		ProductMap p3 = new ProductMap("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		ProductMap ps = new ProductMap("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
	}

}
