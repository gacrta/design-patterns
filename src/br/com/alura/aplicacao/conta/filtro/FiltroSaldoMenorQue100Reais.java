package br.com.alura.aplicacao.conta.filtro;

import br.com.alura.aplicacao.conta.Conta;

public class FiltroSaldoMenorQue100Reais extends Filtro {

	public FiltroSaldoMenorQue100Reais() {}
	
	public FiltroSaldoMenorQue100Reais(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	@Override
	public boolean deveRecusar(Conta conta) {
		return conta.getSaldo() < 100;
	}

}
