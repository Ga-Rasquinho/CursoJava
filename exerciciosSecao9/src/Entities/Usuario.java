package Entities;

import java.util.Scanner;

public class Usuario {
	public String nome;
	public int conta;
	public double valor;
	
	Scanner sc = new Scanner(System.in);
	public double calcSaque(double valor) {
		this.valor -= 5 + valor;
		return valor;
	}

	public void mostrarDadosUsuario() {
		System.out.printf("Conta: " + conta + ", Nome: " + nome + ", SALDO TOTAL: R$ %.2f%n", valor);
	}

	public void depositar(char digito) {			
		if (digito == 'S' || digito == 's') {
			System.out.print("Quantidade a depositar: ");
			this.valor = sc.nextDouble();
			System.out.println("Saldo atualizado: ");
			mostrarDadosUsuario();
		}
	}
	
	public void sacar(char digitoSaque) {		
		if (digitoSaque == 'S' || digitoSaque == 's') {
			System.out.print("Digite o valor a ser sacado: ");
			double valor = sc.nextDouble();
			calcSaque(valor);
			System.out.println("Saldo total: ");
			mostrarDadosUsuario();
		}else {
			mostrarDadosUsuario();
		}
		sc.close();
	}

}
