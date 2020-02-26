package br.com.alura.aplicacao.notafiscal;

public class TesteNotaFiscal {

	public static void main(String[] args) {

		ItemDaNotaBuilder itemBuilder = new ItemDaNotaBuilder();

		NotaFiscal nf = new NotaFiscalBuilder()
				.paraEmpresa("Caelum Ensino e Inovacao")
				.comCnpj("23.456.789/0001-12")
				.com(itemBuilder.comNome("Item1").comValor(10.0).build()) // new ItemDaNota("Item1", 10.0)
				.com(itemBuilder.comNome("Item2").comValor(43.50).build()) // new ItemDaNota("Item2", 43.50)
				.com(itemBuilder.comNome("Item3").comValor(31.50).build()) // new ItemDaNota("Item3", 31.50)
				.comObservacoes("entregar nf pessoalmente")
				.naDataAtual()
				.constroi();

	}
}
