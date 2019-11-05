import java.util.Date;

public class Transferencia implements Operacao{
	private double valor;
	private Date data;
	private Conta origem;
	private Conta destino;

	public Transferencia(Double valor, Conta origem, Conta destino) {
		this.valor = valor;
		this.origem = origem;
		this.destino = destino;
	}
	
	public boolean efetuar() {
		boolean irineu = false;
		
		return true;
	}
}
