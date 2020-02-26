package br.com.alura.aplicacao.conta.filtro;

import br.com.alura.aplicacao.conta.Conta;

public class FiltroSaldoMaiorQue500MilReais extends Filtro {

	public FiltroSaldoMaiorQue500MilReais() {}
	
	public FiltroSaldoMaiorQue500MilReais(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	@Override
	public boolean deveRecusar(Conta conta) {
		return conta.getSaldo() > 500000;
	}

}
