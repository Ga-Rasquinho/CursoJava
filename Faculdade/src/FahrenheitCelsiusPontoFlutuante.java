import java.util.Locale;
import java.util.Scanner;

public class FahrenheitCelsiusPontoFlutuante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valorFahrenheit, total;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura: ");
		valorFahrenheit = sc.nextDouble();
		
		total = (valorFahrenheit - 32.0) * (5.0 / 9.0);
		System.out.println("Valor em celsius: " + total);
		sc.close();
	}

}
