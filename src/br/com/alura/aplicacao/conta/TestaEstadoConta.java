package br.com.alura.aplicacao.conta;

public class TestaEstadoConta {
	
	public static void main(String[] args) {
		Conta conta = new Conta("1");
		conta.deposita(300);
		
		System.out.println(conta.saldo);
		
		conta.saca(350);
		
		System.out.println(conta.saldo);
		
		conta.deposita(100);
		
		System.out.println(conta.saldo);
		
		conta.saca(100);
		System.out.println(conta.saldo);
		conta.saca(10);
		System.out.println(conta.saldo);
	}

}
