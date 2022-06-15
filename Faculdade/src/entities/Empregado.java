package entities;

public class Empregado extends Usuario {
	private String funcaoEmpregado;

	public Empregado(int idUsuario, String nome, int tipoUsuario, String funcaoEmpregado) {
		super(idUsuario, nome, tipoUsuario);
		this.funcaoEmpregado = funcaoEmpregado;
	}


	
}
