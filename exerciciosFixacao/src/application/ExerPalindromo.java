package application;

import java.util.Scanner;

public class ExerPalindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira palavra");
		String texto = sc.next();
		
		String reverso = new StringBuffer(texto).reverse().toString();
		
		if(texto.toLowerCase().equals(reverso.toLowerCase())) {
			System.out.println("\n" + texto + " � um pal�ndromo");
		}else {
			System.out.println("\n" + texto + " n�o � um pal�ndromo");
		}
		
		sc.close();
	}

}
