package br.com.alura.aplicacao.conta.requisicao;

import br.com.alura.aplicacao.conta.Conta;

public class Requisicao {

	static enum Formato {
		XML,
		CSV,
		PORCENTO
	}

	private Formato formato;

	public Requisicao(Formato formato) {
		this.formato = formato;
	}

	public String getResposta(Conta conta) {
//		Resposta xml = new RespostaXML();
//		Resposta csv = new RespostaCSV();
//		Resposta porcento = new RespostaPORCENTO();
//		Resposta nada = new RespostaSemFormato();
//		
//		xml.setProximo(csv);
//		csv.setProximo(porcento);
//		porcento.setProximo(nada);
		
		
		Resposta xml = new RespostaXML( new RespostaCSV ( new RespostaPORCENTO( new RespostaSemFormato(null) ) ) );
		
		
		return xml.formata(conta, this.formato);
	}

}
