package application;

import java.util.Scanner;

import entities.Calculadora2;

public class Main2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int x = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int y = sc.nextInt();
        int z = sc.nextInt();
        Calculadora2 calcular = new Calculadora2();
        
        System.out.println("Resultado da soma: " + calcular.somar(x, y,z));
        sc.close();
	}

}
