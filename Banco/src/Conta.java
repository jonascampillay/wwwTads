public class Conta {
	private static int numConta;
	private int numeroAg;
	private int codCliente;
	private double saldo;
	private double limite;
	private static int maxNumConta = 1000;

	public Conta(int numeroAg, int codCliente, double saldo, double limite) {
		this.numConta = maxNumConta++;
		this.numeroAg = numeroAg;
		this.saldo = saldo;
		this.limite = limite;
		this.codCliente = codCliente;
	}
	protected Conta(int numeroAg,  int codCliente) {
		this.numConta = maxNumConta++;
		this.numeroAg = numeroAg;
		this.saldo = 0.0;
		this.limite = 0.0;
		this.codCliente = codCliente;
	}

	@Override
	public boolean equals(Object obj) {
		Conta conta = (Conta) obj;
		return this.numConta == conta.numConta;
	}
	public boolean sacar(double valor) {
		double limiteSaque = this.saldo + this.limite;

		if (limiteSaque >= valor) {
			this.saldo -= valor;
			System.out.println("Operação aprovada");
			return true;
		}
		System.out.println("Saldo insuficiente");
		return false;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("Operação aprovada");
		} else {
			System.out.println("Valor inválido");
		}

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

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public int getMaxNumConta() {
		return maxNumConta;
	}

	public void setMaxNumConta(int maxNumConta) {
		this.maxNumConta = maxNumConta;
	}

	public void deposito(double valorDeposito) {
		// TODO Auto-generated method stub
	}
	@Override
	public String toString() {
		return "Conta [numConta=" + numConta + ", numeroAg=" + numeroAg + ", saldo=" + saldo + ", limite=" + limite
				+ "]";
	}
}