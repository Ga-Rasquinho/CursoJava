package applicationExercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesExercicio.ImportedProduct;
import entitiesExercicio.Product;
import entitiesExercicio.UsedProduct;

public class MainExercicio {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		var qtdProduct = sc.nextInt();
		for (int i = 1; i <= qtdProduct; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.println("Common, used or imported (c/u/i)");			
			var opc = sc.next().charAt(0);
			System.out.print("Name: ");
			var name = sc.next();
			System.out.print("Price: ");
			var price = sc.nextDouble();
			
			if(opc == 'c') {
				list.add(new Product(name, price));
			} else if (opc == 'i') {
				System.out.print("Customs fee: ");
				var customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			} else if (opc == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manufactureDate));
			} else {
				System.out.println("Erro");
			}
		
		}
		
		System.out.println();
		System.out.println("Price tags");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		sc.close();
	}

}
