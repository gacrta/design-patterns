package br.com.alura.aplicacao.imposto;

import br.com.alura.aplicacao.Orcamento;

public class TesteDeImpostos {

	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();

		Orcamento orcamento = new Orcamento(500.0);

		CalculadorDeImpostos calculador = new CalculadorDeImpostos();

		// Calculando o ISS
		calculador.realizaCalculo(orcamento, iss);

		// Calculando o ICMS
		calculador.realizaCalculo(orcamento, icms);
		
		// Testando ICPP e IKCV - Template method
		Imposto ikcv = new IKCV();
		Imposto icpp = new ICPP();
		calculador.realizaCalculo(orcamento, ikcv);
		calculador.realizaCalculo(orcamento, icpp);
		
		// Testando ICPP e IKCV - Decorator
		Imposto ikcvComIcpp = new IKCV(new ICPP());
		calculador.realizaCalculo(orcamento, ikcvComIcpp);
	}
}