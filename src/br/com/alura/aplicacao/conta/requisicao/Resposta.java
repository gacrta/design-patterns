package br.com.alura.aplicacao.conta.requisicao;

import br.com.alura.aplicacao.conta.Conta;
import br.com.alura.aplicacao.conta.requisicao.Requisicao.Formato;

// classe base da chain of responsability
public abstract class Resposta {
	protected Resposta proximo;
	
	public Resposta(Resposta proximo) {
		this.proximo = proximo;
	}
	
	public abstract String formata(Conta conta, Formato formato);
	
//	public void setProximo(Resposta proximo) {
//		this.proximo = proximo;
//	}
}
