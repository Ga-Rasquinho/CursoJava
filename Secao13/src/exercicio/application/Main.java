package exercicio.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercicio.entities.Client;
import exercicio.entities.Order;
import exercicio.entities.OrderItem;
import exercicio.entities.Product;
import exercicio.entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite as informacoes do cliente: ");
		System.out.print("Digite o nome: ");
		String clientName = sc.nextLine();
		System.out.print("Digite o e-mail: ");
		String email = sc.nextLine();
		System.out.println("Digite a data: (DD/MM/YYYY)");
		Date clientBirthDate = sdf.parse(sc.next());
		Client cliente = new Client(clientName, email, clientBirthDate);
		
		System.out.println("Defina o status do pedido: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, cliente);
		
		System.out.print("Digite a quantidade de itens que deseja adicionar: ");
		var x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			System.out.println("Digite o produto #" + i);
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Preco do produto: ");
			double price = sc.nextDouble();
			System.out.println("Quantidade: ");
			int quantity = sc.nextInt();
			Product product = new Product(productName, price);
			
			OrderItem orderIt = new OrderItem(quantity, price, product);
			
			order.addItem(orderIt);
		}
		System.out.println();
		System.out.println(order);
		sc.close();
	}

}
