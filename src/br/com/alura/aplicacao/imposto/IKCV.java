package br.com.alura.aplicacao.imposto;

import br.com.alura.aplicacao.Item;
import br.com.alura.aplicacao.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional {

	//Implementando decorator
	public IKCV() {
	}
	
	//Implementando decorator
	public IKCV(Imposto outro) {
		super(outro);
	}
	
	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if(item.getValor() > 100) return true;
		}
		return false;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
