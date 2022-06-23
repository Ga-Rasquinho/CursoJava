package util;

public class CalculatorMembroEstatico {
	// Adicionando métodos estáticos 
	
	public static final double  PI = 3.14159;
	
	public static double circumference(double radius) {
		return 2 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
	/* Métodos não estáticos 
	public final double  PI = 3.14159;
	
	public double circumference(double radius) {
		return 2 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	*/
}
