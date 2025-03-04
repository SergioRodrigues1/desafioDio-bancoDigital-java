package banco.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}
	
	public void adicionarContas(Conta conta) {
		contas.add(conta);
	}
	
	public void listarContas() {
		System.out.println("==== Contas no Banco ====");
		
		for(Conta conta : contas) {
			conta.imprimirExtrato();
			System.out.println("--------------------------");
		}
	}
	
	public double calcularSaldoTotal() {
		double saldoTotal = 0.0;
		for(Conta conta : contas) {
			saldoTotal += conta.getSaldo();
		}
		return saldoTotal;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Conta> getContas(){
		return contas;
	}
	
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
}