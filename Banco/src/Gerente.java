import java.io.Serializable;

public class Gerente extends Pessoa implements Serializable{
	private int codGerente;
	private int numeroAg;
	private int matricula;
	private double salario;


	public Gerente() {
		this.codGerente = 0;
		this.numeroAg = 0;
		this.matricula = 0;
		this.salario = 0.0;
	}
	
	public Gerente(int codGerente) {
		this.codGerente = codGerente;
		this.matricula = 0;
		this.salario = 0.0;
		this.numeroAg = 0;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getCodGerente() {
		return codGerente;
	}

	public void setCodGerente(int codGerente) {
		this.codGerente = codGerente;
	}

	public int getNumeroAg() {
		return numeroAg;
	}

	public void setNumeroAg(int numeroAg) {
		this.numeroAg = numeroAg;
	}
	@Override
	public String toString() {
		return "Gerente [codGerente=" + codGerente + ", numeroAg=" + numeroAg + ", matricula=" + matricula
				+ ", salario=" + salario + "]";
	}
}
