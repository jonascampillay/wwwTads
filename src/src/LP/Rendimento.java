package LP;

public class Rendimento implements Operacao {

	
	Conta conta;

	public Rendimento(Conta conta) {
		this.conta = conta;
	
	}

	@Override
	public boolean efetuar() {
		
		conta.viraMes();
		conta.addOperacao(this);
		
		return true;
		
	}

}
