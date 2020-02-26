package br.com.alura.aplicacao.imposto;

import br.com.alura.aplicacao.Orcamento;

public class ICCC extends Imposto {
	
	public ICCC() {
	}
	
	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}

	public double calcula(Orcamento orcamento) {
		double outroValor = calculaOutroImposto(orcamento);
		if (orcamento.getValor() < 1000) {
			return orcamento.getValor() * 0.05 + outroValor;
		} else if (orcamento.getValor() <= 3000) {
			return orcamento.getValor() * 0.07 + outroValor;
		} else {
			return orcamento.getValor() * 0.08 + 30 + outroValor;
		}
	}
}
