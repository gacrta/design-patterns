package br.com.alura.aplicacao.imposto;

import java.util.List;

import br.com.alura.aplicacao.Item;
import br.com.alura.aplicacao.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		List<Item> itensDoOrcamento = orcamento.getItens();
		int numeroDeItens = itensDoOrcamento.size();
		for(int i = 0; i < numeroDeItens; i++) {
			for(int j = i + 1; j < numeroDeItens; j++) {
				if(itensDoOrcamento.get(i).getNome().equals(itensDoOrcamento.get(j).getNome())) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.01 * orcamento.getItens().size();
	}

}
