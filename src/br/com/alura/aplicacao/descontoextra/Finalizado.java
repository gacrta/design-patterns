package br.com.alura.aplicacao.descontoextra;

import br.com.alura.aplicacao.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos finalizados n�o recebem desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja finalizado");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja finalizado");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja finalizado");
		
	}

}
