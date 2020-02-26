package br.com.alura.aplicacao.conta.requisicao;

import br.com.alura.aplicacao.conta.Conta;
import br.com.alura.aplicacao.conta.requisicao.Requisicao.Formato;

public class RespostaPORCENTO extends Resposta {

	public RespostaPORCENTO(Resposta proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String formata(Conta conta, Formato formato) {
		if(formato.equals(Formato.PORCENTO)) {
			return String.format("%s%%%.2f",
					conta.getTitular(), conta.getSaldo());
		}
		return this.proximo.formata(conta, formato);
	}

}
