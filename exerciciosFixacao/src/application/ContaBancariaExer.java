package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class ContaBancariaExer {

	public static void menuPrincipal() {
		System.out.println("1 - Depositar");
		System.out.println("2 - Sacar");
		System.out.println("3 - Sair");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean continuarExecucao = true;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite o nome do titular: ");
		String nome = sc.next();

		Conta conta = new Conta(numero, nome);
		
		while(continuarExecucao) {
		System.out.println("\nSelecione uma opcao:");
		menuPrincipal();
		final var opc = sc.next();		
			switch (opc) {
			case "1": {
				System.out.print("Digite o valor a ser depositado: ");
				double valor = sc.nextDouble();
				conta.depositar(valor);
				System.out.println(conta.toString());
				break;
			}
			case "2": {
				System.out.print("Digite o valor a ser sacado: ");
				double saque = sc.nextDouble();
				conta.sacar(saque);
				System.out.println(conta.toString());
				break;
			}
			case "3":{
				System.out.println("Saindo");
				continuarExecucao = false;
				break;
			}
			default:
				System.out.println("Erro");
				break;
			}
		}
		
		sc.close();
	}

}
