package br.com.alura.aplicacao.conta.requisicao;

import br.com.alura.aplicacao.conta.Conta;
import br.com.alura.aplicacao.conta.requisicao.Requisicao.Formato;

public class RespostaXML extends Resposta {

	public RespostaXML(Resposta proximo) {
		super(proximo);
	}

	@Override
	public String formata(Conta conta, Formato formato) {
		if(formato.equals(Formato.XML)) {
			return String.format("<conta><titular>%s</titular><saldo>%.2f</saldo></conta>",
					conta.getTitular(), conta.getSaldo());
		}
		return this.proximo.formata(conta, formato);
	}

}
