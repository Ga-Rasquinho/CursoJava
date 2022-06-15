package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.UsuarioRefatorado;

public class Cadastro {

	public void menuPrincipal() {
		System.out.println("1 - Depositar");
		System.out.println("2 - Sacar");
		System.out.println("3 - Trocar nome");
		System.out.println("4 - Sair");
	}

	public boolean respostaValida(final char digito) {
		return (digito == 'S' || digito == 's');
	}
	
	public void fluxoExecucao() {
		boolean continuarExecucao = true;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o numero da conta: ");
		final int conta = sc.nextInt();

		System.out.print("Informe o nome do titular: ");
		final String nome = sc.next();

		final UsuarioRefatorado usuario = new UsuarioRefatorado(nome, conta);

		while (continuarExecucao) {
			menuPrincipal();
			System.out.println("Digite a opção desejada: ");
			final var opcao = sc.next();
			switch (opcao) {
			case "1": {
				System.out.print("Quantidade a depositar: ");
				final double valor = sc.nextDouble();
				usuario.depositar(valor);
				System.out.println(usuario.mostrarDadosUsuario());
				
				break;
			}
			case "2": {
				System.out.print("Quantidade a sacar: ");
				final double valor = sc.nextDouble();
				
				System.out.println("Tem certeza? (S/N) ");
                char escolha = sc.next().charAt(0);
				if (respostaValida(escolha)) {
					if (usuario.usuarioTemSaldoSuficienteParaSaque(valor)) {
						System.out.println("Valor sacado: R$ "+ valor);
						usuario.sacar(valor);
					} else {
						System.out.println("Não pode sacar, valor na sua conta: R$ "+ usuario.getValor());
					}
				}
				System.out.println(usuario.mostrarDadosUsuario());
				
				break;
			}
			case "3": {
				System.out.println("Digite o novo nome: ");
				final var novoNome = sc.next();
				System.out.println("Nome antigo: " + usuario.getNome());
				System.out.println("Nome novo: " + novoNome);

				System.out.println("Tem certeza? (S/N) ");
				char escolha = sc.next().charAt(0);
				if (respostaValida(escolha)) {
					System.out.println("Nome trocado com sucesso!!!");
					usuario.trocarNome(novoNome);
					
					System.out.println(usuario.mostrarDadosUsuario());
				} else {
					System.out.println("Nome não foi trocado");
					System.out.println(usuario.mostrarDadosUsuario());
				}
				
				break;
			}
			case "4": {
				continuarExecucao = false;
				System.out.println("Muito obrigado por utilizar o Rasquinho's Bank");
				
				System.out.println(usuario.mostrarDadosUsuario());
				
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
		}
		sc.close();
	}
}
