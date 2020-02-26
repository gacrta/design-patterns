package br.com.alura.aplicacao.imposto;

import br.com.alura.aplicacao.Orcamento;

public class ImpostoMuitoAlto extends Imposto {
		
	public ImpostoMuitoAlto() {
	}
	
	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculaOutroImposto(orcamento);
	}

}
