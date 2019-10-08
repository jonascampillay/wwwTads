public class Agencia {
	private static int numeroAg;
	private String nome;
	private String endereco;

	public Agencia() {
		this.numeroAg = 0;
		this.nome = "";
		this.endereco = "";
	}
//gjjjg
	public Agencia(int numeroAg) {
		this.numeroAg = numeroAg;
		this.nome = "";
		this.endereco = "";
	}
	public boolean equals(Object obj) {
		Agencia agencia = (Agencia) obj;
		return this.numeroAg == agencia.numeroAg;
	}

	public int getNumeroAg() {
		return numeroAg;
	}

	public void setNumeroAg(int numeroAg) {
		this.numeroAg = numeroAg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Agencia [numeroAg=" + numeroAg + ", nome=" + nome + ", endereco=" + endereco + "]";
	}

}
