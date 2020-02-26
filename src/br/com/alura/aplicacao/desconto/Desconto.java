package br.com.alura.aplicacao.desconto;

import br.com.alura.aplicacao.Orcamento;

public interface Desconto {
	public double desconta(Orcamento orcamento);
	public void setProximo(Desconto desconto);

}
