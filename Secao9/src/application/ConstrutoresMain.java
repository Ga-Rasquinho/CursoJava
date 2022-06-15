package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ConstrutoresMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Product p = new Product();

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		/*
		 * System.out.print("Quantity in Stock: "); 
		 * int quantity = sc.nextInt();
		 */
		Product product = new Product(name, price);
		
		product.setName("Computer");
		
		System.out.println();
		System.out.println("Update name: " + product.getName());
		System.out.print("Digite o preco: ");
		product.setPrice(1200.00);
		
		System.out.println("Update price: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Update data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Update data: " + product);

		sc.close();
	}

}
