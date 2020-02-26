package br.com.alura.aplicacao.desconto;

import br.com.alura.aplicacao.Orcamento;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {

		boolean temLapis = orcamento.contemItemDeNome("LAPIS");
		boolean temCaneta = orcamento.contemItemDeNome("CANETA");;
		
		if (temCaneta && temLapis) {
			return orcamento.getValor()*0.05;
		}

		return this.proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;

	}

}
