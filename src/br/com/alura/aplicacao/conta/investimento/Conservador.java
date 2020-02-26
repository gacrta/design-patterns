package br.com.alura.aplicacao.conta.investimento;

import br.com.alura.aplicacao.conta.Conta;

class Conservador implements Investimento {
	public double calcula(Conta conta) {
		return conta.getSaldo() * 0.008;
	}
}