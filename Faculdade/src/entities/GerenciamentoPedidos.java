package entities;

public class GerenciamentoPedidos extends Empregado {
	private int idPedido;

	public GerenciamentoPedidos(int idUsuario, String nome, int tipoUsuario, String funcaoEmpregado, int idPedido) {
		super(idUsuario, nome, tipoUsuario, funcaoEmpregado);
		this.idPedido = idPedido;
	}	
	
}
