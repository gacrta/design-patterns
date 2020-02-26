package br.com.alura.aplicacao.imposto;

import br.com.alura.aplicacao.Orcamento;

public class ISS extends Imposto {
	
	public ISS() {
	}
	
	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculaOutroImposto(orcamento);
	}

}