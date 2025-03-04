package banco.main;

import banco.model.Banco;
import banco.model.Cliente;
import banco.model.Conta;
import banco.model.ContaCorrente;
import banco.model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Cliente sergio = new Cliente("Sergio", "456.456.897-00");
		Cliente jose = new Cliente("José", "445.133.489-00");
		
		Conta ccSergio = new ContaCorrente(sergio, 500.0);
		Conta poupancaJose = new ContaPoupanca(jose);
		
		Banco banco = new Banco("Banco XVZ");
		
		banco.adicionarContas(ccSergio);
		banco.adicionarContas(poupancaJose);
		
		ccSergio.depositar(1000);
		ccSergio.transferir(200, poupancaJose);
		
		banco.listarContas();
		
		System.out.println(String.format("Saldo total do Banco: R$ %.2f", banco.calcularSaldoTotal()));

	}

}
