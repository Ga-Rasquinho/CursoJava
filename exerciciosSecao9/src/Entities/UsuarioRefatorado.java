package Entities;

public class UsuarioRefatorado {
	private static final double TAXA_SAQUE = 5.0;

	private String nome;
	private int conta;
	private double valor;

    public UsuarioRefatorado(final String nome, final int conta) {
        this.nome = nome;
        this.conta = conta;
        this.valor = 0;
    }

	public String getNome() {
		return nome;
	}

	public int getConta() {
		return conta;
	}

	public double getValor() {
		return valor;
	}
	
	private String getValorFormatado() {
		return String.format("%.2f%n", valor);
    }
	
	private double calcSaque(final double valor) {
		this.valor = this.valor - (TAXA_SAQUE + valor);
		return getValor();
	}

	public String mostrarDadosUsuario() {
		var stringBuilder = new StringBuilder();
		stringBuilder.append("Conta: ").append(getConta()).append(", Nome: ").append(getNome()).append(", SALDO TOTAL: R$ ")
				.append(getValorFormatado());

		return stringBuilder.toString();
	}

	public void depositar(final double valor) {
        this.valor += valor;
	}
	
	public void sacar(final double valor) {
        calcSaque(valor);
    }
    
    public void trocarNome(final String nome) {
        this.nome = nome;
    }
    
    public boolean usuarioTemSaldoSuficienteParaSaque(final double valor) {
		if ((this.valor - valor) == 0) {
			return true;
		} else {
			return false;
		}
    }
}
