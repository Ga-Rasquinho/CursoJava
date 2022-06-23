package entities;

public class Usuario {
	private String nome;
	private String conta;
	private double valor;
	
	public Usuario (String nome, String conta) {
		this.nome = nome;
		this.conta = conta;
	}
	
	public String getNome() {
		return nome;
	}
	public String getConta() {
		return conta;
	}
	public double getValor() {
		return valor;
	}	
	
}
