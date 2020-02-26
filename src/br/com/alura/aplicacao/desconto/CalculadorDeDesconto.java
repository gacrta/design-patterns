package br.com.alura.aplicacao.desconto;

import br.com.alura.aplicacao.Orcamento;

public class CalculadorDeDesconto {

	public double calcula(Orcamento orcamento) {
		// mais de 5 itens = desconto!
		Desconto d1 = new DescontoPorMaisDeCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);
		
		return d1.desconta(orcamento);
	}
}
