package br.com.alura.aplicacao.notafiscal;

public class TesteNotaFiscal {

	public static void main(String[] args) {

		NotaFiscal nf = new NotaFiscalBuilder()
				.paraEmpresa("Caelum Ensino e Inovacao")
				.comCnpj("23.456.789/0001-12")
				.com(new ItemDaNota("Item1", 10.0))
				.com(new ItemDaNota("Item2", 43.50))
				.com(new ItemDaNota("Item3", 31.50))
				.comObservacoes("entregar nf pessoalmente")
				.naDataAtual()
				.constroi();

	}
}
