package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class mainExer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario entradaDados = new Funcionario();
		System.out.print("Digite o nome do funcionario: ");
		entradaDados.nome = sc.next();
		System.out.print("Digite o salario bruto: ");
		entradaDados.salario = sc.nextDouble();
		System.out.print("Digite a taxa de imposto: ");
		entradaDados.taxa = sc.nextDouble();
		
		entradaDados.mostrarDados();
		
		System.out.print("Digite a porcentagem a ser acrescentada: ");
		entradaDados.imposto = sc.nextDouble();
		
		entradaDados.mostrarTaxa();
		sc.close();
	}

}
