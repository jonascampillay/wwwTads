public class Cliente {
	private int codCliente;
	private int numeroAg;
	private static int maxCodCliente = 1;
	private int senha;
	
	public Cliente(int codCliente) {
		this.codCliente = codCliente;
		//this.numeroAg = maxCodCliente++;
		this.senha = 0;
	}
	
	public Cliente() {
	//	this.codCliente = maxCodCliente++;
		this.numeroAg = 0;
		this.senha = 0;
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public int getNumeroAg() {
		return numeroAg;
	}


	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public void setNumeroAg(int numeroAg) {
		this.numeroAg = numeroAg;
	}

	@Override
	public String toString() {
		return "Cliente [codCliente=" + codCliente + ", codAgencia=" + numeroAg + "]";
	}

}
