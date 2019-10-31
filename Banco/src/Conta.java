import java.io.Serializable;
import java.util.Scanner;

public abstract class Conta implements Serializable{
	protected int numConta;
	protected int numeroAg;
	protected Cliente titular;
	protected String tipo;
	protected double saldo;
	private static int contador = 1000;

	public Conta(int numeroAg, double saldo, double limite) {
		this.numConta = ++contador;
		this.numeroAg = numeroAg;
		this.saldo = saldo;
	}

	protected Conta(int numeroAg, Cliente titular) {
		this.numConta = ++contador;
		this.titular = titular;
		this.numeroAg = numeroAg;
		this.saldo = 0.0;
	}

	@Override
	public boolean equals(Object obj) {
		Conta conta = (Conta) obj;
		return this.numConta == conta.numConta;
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
			System.out.println("Opera��o aprovada");
			return true;
		}
		System.out.println("Valor n�o permitido");
		return false;
	}

	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("Opera��o aprovada");
			return true;
		}
		System.out.println("Valor inv�lido");
		return false;

	}

	public boolean transferir(Scanner entrada) {
		Cliente clientinho = GerenciaCliente.selecionarCliente(entrada);
		if (clientinho != null) {
			Conta contaDestino = GerenciaConta.selecionarConta(clientinho, entrada);
			if (contaDestino.getNumConta() > 0 && contaDestino.getNumConta() != this.getNumConta()) {
				System.out.println("Insira o valor que deseja transferir");
				double valor = Double.valueOf(entrada.nextLine());
				if (this.sacar(valor)) {
					contaDestino.depositar(valor);
					return true;
				}
			} else {
				System.out.println("Opera��o n�o permitida");
			}
		}
		return false;
	}

	public static String registrarHistorico(String[] historico, int cont, double valor) {
		String saidaHistorico = "";
		// Registar no vetor as transa��es de dep�sito
		if (valor > 0) {
			historico[cont] = "Dep�sito de R$" + valor + ".";
			saidaHistorico += "\n" + historico[cont];
		}
		// Registrar no hist�rico as transa��es de saque
		else if (valor < 0) {
			valor = -(valor);
			historico[cont] = "Saque de R$" + valor + ".";
			saidaHistorico += "\n" + historico[cont];
		}
		return saidaHistorico;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getAgencia() {
		return numeroAg;
	}

	public void setAgencia(int numeroAg) {
		numeroAg = numeroAg;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getMaxNumConta() {
		return contador;
	}

	public void setMaxNumConta(int maxNumConta) {
		this.contador = maxNumConta;
	}

	public int getNumeroAg() {
		return numeroAg;
	}

	public void setNumeroAg(int numeroAg) {
		this.numeroAg = numeroAg;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "/n Conta: \nnumConta = " + numConta + "\\nnumeroAg = " + numeroAg + "\nsaldo = " + saldo + "\n-------------------------------------------";
	}
}