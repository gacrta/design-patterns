package br.com.alura.aplicacao.imposto;

import br.com.alura.aplicacao.Orcamento;

public class TesteDeImpostoComplexo {
	public static void main(String[] args) {
		Imposto issComIcms = new ISS(new ICMS());
		
		Orcamento o = new Orcamento(500);
		
		System.out.println(issComIcms.calcula(o));
		
		Imposto imp = new ImpostoMuitoAlto(new ICMS());
		
		System.out.println(imp.calcula(o));
	}
	
	
}
