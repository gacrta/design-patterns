package br.com.alura.aplicacao.descontoextra;

import br.com.alura.aplicacao.Orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento {
	
	private boolean descontoDisponivel = true;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(descontoDisponivel) {
			orcamento.valor -= orcamento.valor * 0.05;
			descontoDisponivel = false;
		}
		else {
			throw new RuntimeException("Desconto ja foi dado");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento em aprovacao nao pode ir para finalizado");
		
	}

}
