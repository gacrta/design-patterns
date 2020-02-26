package br.com.alura.aplicacao.descontoextra;

import br.com.alura.aplicacao.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento {
	
	private boolean descontoDisponivel = true;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(descontoDisponivel) {
			orcamento.valor -= orcamento.valor * 0.02;
			descontoDisponivel = false;
		}
		else {
			throw new RuntimeException("Desconto ja foi dado");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja aprovado");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja aprovado nao pode ser reprovado");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}

}
