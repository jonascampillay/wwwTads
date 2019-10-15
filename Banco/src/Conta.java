import java.util.Scanner;

public abstract class Conta {
	protected static int numConta;
	protected int numeroAg;
	protected int codCliente;
	protected double saldo;
	private static int maxNumConta = 1000;

	public Conta(int numeroAg, int codCliente, double saldo, double limite) {
		this.numConta = maxNumConta++;
		this.numeroAg = numeroAg;
		this.saldo = saldo;
		this.codCliente = codCliente;
	}

	protected Conta(int numeroAg, int codCliente) {
		this.numConta = maxNumConta++;
		this.numeroAg = numeroAg;
		this.saldo = 0.0;
		this.codCliente = codCliente;
	}

	@Override
	public boolean equals(Object obj) {
		Conta conta = (Conta) obj;
		return this.numConta == conta.numConta;
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
			System.out.println("Operação aprovada");
			return true;
		}
		System.out.println("Valor não permitido");
		return false;
	}

	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("Operação aprovada");
			return true;
		}
		System.out.println("Valor inválido");
		return false;

	}

	public boolean transferir(Scanner entrada) {
		Cliente clientinho = GerenciaCliente.selecionarCliente(entrada);
		if (clientinho != null) {
			Conta contaDestino = GerenciaConta.selecionarConta(clientinho.getCodCliente(), entrada);
			if (contaDestino.getNumConta() > 0 && contaDestino.getNumConta() != this.getNumConta()) {
				double valor = Double.valueOf(entrada.nextLine());
				if(this.sacar(valor)) {
					contaDestino.depositar(valor);
					return true;
				}
			} else {
				System.out.println("Operação não permitida");
			}
		}
		return false;
	}

	public static String registrarHistorico(String[] historico, int cont, double valor) {
		String saidaHistorico = "";
		// Registar no vetor as transações de depósito
		if (valor > 0) {
			historico[cont] = "Depósito de R$" + valor + ".";
			saidaHistorico += "\n" + historico[cont];
		}
		// Registrar no histórico as transações de saque
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
		return maxNumConta;
	}

	public void setMaxNumConta(int maxNumConta) {
		this.maxNumConta = maxNumConta;
	}

	public int getNumeroAg() {
		return numeroAg;
	}

	public void setNumeroAg(int numeroAg) {
		this.numeroAg = numeroAg;
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	@Override
	public String toString() {
		return "Conta [numConta=" + numConta + ", numeroAg=" + numeroAg + ", saldo=" + saldo + "]";
	}
}