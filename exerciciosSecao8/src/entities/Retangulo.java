package entities;

public class Retangulo {

		public double altura;
		public double largura;
		
	public double calcArea() {
		double area = altura * largura;
		return area;
	}
	
	public double calcPerimetro() {
		double perimetro = 2 * (altura + largura);
		return perimetro;
	}
	
	public double calcDiagonal() {
		double diagonal = Math.sqrt( (altura * altura) + (largura * largura));
		return diagonal;
	}
	
	public void showResult() {
		System.out.printf("Area: %.2f\n", calcArea());
		System.out.printf("Perimetro: %.2f\n", calcPerimetro());
		System.out.printf("Diagonal: %.2f", calcDiagonal());
	}
}
