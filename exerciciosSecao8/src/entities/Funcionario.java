package entities;

public class Funcionario {
	public String nome;
	public double salario;
	public double taxa;
	public double imposto;
	
	public double calcTaxa() {
		double resultado = salario - taxa;
		return resultado;
	}
	
	public double calcSegundoImposto() {
		double resultado = (imposto * salario) / 100;
		resultado += calcTaxa();
		return resultado;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.printf("Salario bruto: R$%.2f\n", calcTaxa());
	}
	
	public void mostrarTaxa() {
		System.out.printf("Valor total: R$%.2f", calcSegundoImposto());
	}
}
