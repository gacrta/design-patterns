package br.com.alura.aplicacao.conta.investimento;

import br.com.alura.aplicacao.conta.Conta;

class RealizadorDeInvestimentos {
	public void realiza(Conta conta, Investimento investimento) {
		double resultado = investimento.calcula(conta);

		conta.deposita(resultado * 0.75);
		System.out.println("Novo saldo: " + conta.getSaldo());
	}
}