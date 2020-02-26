package br.com.alura.aplicacao.imposto;

import br.com.alura.aplicacao.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto {

	//Implementando decorator
	public TemplateDeImpostoCondicional() {
	}
	
	//Implementando decorator
	public TemplateDeImpostoCondicional(Imposto outro) {
		super(outro);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		double valorOutroImposto = this.calculaOutroImposto(orcamento);
		
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + valorOutroImposto;
		}
		return minimaTaxacao(orcamento) + valorOutroImposto;
	}

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract double minimaTaxacao(Orcamento orcamento);

}
