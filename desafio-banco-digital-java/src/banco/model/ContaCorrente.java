package banco.model;

public class ContaCorrente extends Conta {
	
	private double limiteCredito;

	public ContaCorrente(Cliente cliente, double limiteCredito) {
		super(cliente);
		this.limiteCredito = limiteCredito;
	}
	
	public void sacar(double valor) {
		if(valor <= (getSaldo() + limiteCredito)) {
			super.sacar(valor);
		}else
			System.out.println("Saldo e limite de crédito insufiente para saque.");
	}
	
	public void imprimirExtrato() {
		System.out.println("==== Extrato Conta Corrente ====");
		super.imprimirInfosComuns();
		System.out.println(String.format("Limite de crédito: %.2f", this.limiteCredito));
	}

}
