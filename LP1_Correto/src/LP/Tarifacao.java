package LP;

public class Tarifacao implements Operacao {

	Conta conta;

	public Tarifacao(Conta conta) {
		this.conta = conta;
	}

	@Override
	public boolean efetuar() {
		conta.viraMes();
		conta.addOperacao(this);
		return true;

	}
}