public class Cliente extends Pessoa{
	private int codCliente;
	private int numeroAg;
	private static int maxCodCliente = 1;
	private int senha;
	
	public Cliente() {
		this.codCliente = maxCodCliente++;
		this.numeroAg = 0;
		this.senha = 0;
	}
	public Cliente(Pessoa pessoa) {
		this.nome = pessoa.getNome();
		this.CPF = pessoa.getCPF();
		this.endereco = pessoa.getEndereco();
		this.codCliente = pessoa.getCodPessoa();
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
		return "\n\nCliente: " + this.getNome() + "\ncodCliente = " + codCliente + "\ncodAgencia = " + numeroAg + "\n-------------------------------------";
	}

}
