package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaTratamentoExcecoes;
import model.exceptions.ExceedsLimit;

public class ExerComTratamentoDeExcecoes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withDrawLimit = sc.nextDouble();

			ContaTratamentoExcecoes conta = new ContaTratamentoExcecoes(number, holder, balance, withDrawLimit);

			System.out.print("\nEnter amount for withdraw: ");
			Double amount = sc.nextDouble();
			conta.withDraw(amount);
			System.out.println(conta.toString());
		} catch (ExceedsLimit e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		sc.close();
	}

}
