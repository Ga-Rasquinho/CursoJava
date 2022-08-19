package entities;

public class Conta {
	private int numero;
	private String nome;
	private double valor;
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		this.valor = 0;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}
	
	public double depositar(double valor) {
		this.valor = valor;
		return this.valor;
	}
	
	public double sacar(double saque) {
		this.valor = (this.valor - saque) - 5.00;
		return this.valor;
	}

	@Override
	public String toString() {
		return "\nConta: " + numero + ", Nome: " + nome + String.format(", Valor: R$ %.2f%n", valor);
	}
	
	
}
