package application;

import java.util.Locale;
import java.util.Scanner;

public class MainVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		var n = sc.nextInt();
		double[] vect = new double[n];
		
		for (var i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		var sum = 0.0;
		for (var i = 0; i < n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		sc.close();
	}

}
