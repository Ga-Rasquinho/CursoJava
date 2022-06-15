import java.util.Locale;
import java.util.Scanner;

public class FahrenheitCelsiusInteiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valorFahrenheit, total;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura: ");
		valorFahrenheit = sc.nextInt();
		
		total = (valorFahrenheit - 32) * (5 / 9);
		System.out.println("Valor em celsius: " + total);
		sc.close();

	}

}
