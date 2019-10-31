import java.io.Serializable;

public class Agencia implements Serializable {
	private static int contador = 100;
	private int numeroAg;
	private Gerente gerente;
	private String nome;
	private String endereco;

	public Agencia() {
		this.numeroAg = ++contador;
		this.nome = "";
		this.endereco = "";
		this.gerente = new Gerente("Sem gerente");
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

	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	@Override
	public String toString() {
		return "\n\nAgencia: " + this.nome + "\nNumero = " + this.numeroAg + "\nEndereco=" + //
				this.endereco + "\nGerente: " + this.gerente.getNome() + "\n -----------------------------------------------------";
	}

}
