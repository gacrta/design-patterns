package br.com.alura.aplicacao.conta.requisicao;

import br.com.alura.aplicacao.conta.Conta;
import br.com.alura.aplicacao.conta.requisicao.Requisicao.Formato;

public class RespostaSemFormato extends Resposta {

	public RespostaSemFormato(Resposta proximo) {
		super(null);
		
	}

	@Override
	public String formata(Conta conta, Formato formato) {
		return conta.toString();
	}

}
