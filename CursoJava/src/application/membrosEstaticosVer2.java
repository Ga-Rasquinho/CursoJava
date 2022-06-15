package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorMembroEstatico;

public class membrosEstaticosVer2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Em métodos estáticos não há a necessidade de realizar a instancia 		
		//CalculatorMembroEstatico calc = new CalculatorMembroEstatico();
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		// Chamada de método estático que está em uma classe
		double c = CalculatorMembroEstatico.circumference(radius);
		double v = CalculatorMembroEstatico.volume(radius);
		
		/* Forma de chamar métodos não estáticos
		double c = calc.circumference(radius);		
		double v = calc.volume(radius);
		*/
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI Value: %.2f%n", CalculatorMembroEstatico.PI);
//		System.out.printf("PI Value: %.2f%n", calc.PI);
		sc.close();
	}
}
