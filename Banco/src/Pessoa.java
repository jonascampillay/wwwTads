import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Pessoa {
	private String nome;
	private String CPF;
	private String endereco;
	private int codPessoa;
	private static int contador = 1;

	public Pessoa(String CPF) {
		this.nome = "";
		this.CPF = CPF;
		this.endereco = "";
		this.codPessoa = ++contador;
	}

	public Pessoa() {
		this.nome = "";
		this.CPF = "";
		this.endereco = "";
		this.codPessoa = ++contador;
	}

	public int getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(int codPessoa) {
		this.codPessoa = codPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
