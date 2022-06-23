package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;


public class mainExer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo valor = new Retangulo();
		
		System.out.print("Digite o valor da altura: ");
		valor.altura = sc.nextDouble();
		
		System.out.print("Digite a largura: ");
		valor.largura = sc.nextDouble();
		
		valor.showResult();
		sc.close();
	}

}
