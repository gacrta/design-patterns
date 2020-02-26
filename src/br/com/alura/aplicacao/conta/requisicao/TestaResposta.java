package br.com.alura.aplicacao.conta.requisicao;

import br.com.alura.aplicacao.conta.Conta;

public class TestaResposta {

	public static void main(String[] args) {
		Conta conta = new Conta("Gabriel Almeida");
		conta.deposita(152.57);
		
		Requisicao rCsv = new Requisicao(Requisicao.Formato.CSV);
		Requisicao rXml = new Requisicao(Requisicao.Formato.XML);
		Requisicao rPorcento = new Requisicao(Requisicao.Formato.PORCENTO);
		
		System.out.println(rCsv.getResposta(conta));
		System.out.println(rXml.getResposta(conta));
		System.out.println(rPorcento.getResposta(conta));

	}

}
