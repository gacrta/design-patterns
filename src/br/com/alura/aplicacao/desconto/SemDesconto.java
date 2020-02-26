package br.com.alura.aplicacao.desconto;

import br.com.alura.aplicacao.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {
		// nao tem
	}

}
