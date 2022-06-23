package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Usuario;

public class Main {

	public static void main(String[] args) {
		
		final var cadastro = new Cadastro();
		cadastro.fluxoExecucao();
		
// 		Locale.setDefault(Locale.US);
// 		Scanner sc = new Scanner(System.in);
// 		Usuario usuario = new Usuario();
// 
// 		System.out.print("Informe o numero da conta: ");
// 		usuario.conta = sc.nextInt();
// 
// 		System.out.print("Informe o nome do titular: ");
// 		usuario.nome = sc.next();
// 
// 		System.out.print("Deseja depositar? (S/N) ");
// 		usuario.depositar(sc.next().charAt(0));
// 
// 		System.out.print("Deseja realizar um saque? (S/N) ");
// 		usuario.sacar(sc.next().charAt(0));

// 		System.out.println("Deseja realizar um deposito? (S/N)");
// 		cadastro.verificar(sc.next().charAt(0));
		
// 		sc.close();
	}

}
