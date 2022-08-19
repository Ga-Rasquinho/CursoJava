package entities;

import model.exceptions.ExceedsLimit;

public class ContaTratamentoExcecoes {
	private int number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public ContaTratamentoExcecoes(int number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}
	
	public void withDraw(Double amount) throws ExceedsLimit {
		if(amount > this.withDrawLimit) {
			throw new ExceedsLimit("The amount exceeds withdraw limit");
		} if (amount > this.balance) {
			throw new ExceedsLimit("Not enough balance");
		}
		this.balance = this.balance - amount;
	}

	@Override
	public String toString() {
		return "New balance: " + String.format("$%.2f%n", balance);
	}
	
	
}
