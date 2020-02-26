package br.com.alura.aplicacao.notafiscal;

public class TestaAcoes {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.cadastraAcao(new EnviadorDeSms()).cadastraAcao(new EnviadorPorEmail()).cadastraAcao(new Impressora())
				.cadastraAcao(new NotaFiscalDao()).paraEmpresa("Caelum Ensino e Inovacao")
				.comCnpj("23.456.789/0001-12")
				.com(new ItemDaNota("Item1", 10.0))
				.com(new ItemDaNota("Item2", 43.50))
				.com(new ItemDaNota("Item3", 31.50))
				.comObservacoes("entregar nf pessoalmente")
				.naDataAtual();
		
		NotaFiscal nf = builder.constroi();
	}

}
