package br.com.alura.aplicacao.imposto;

import br.com.alura.aplicacao.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {

	//Implementando decorator
	public ICPP() {
	}
	
	//Implementando decorator
	public ICPP(Imposto outro) {
		super(outro);
	}
	
	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}
}
