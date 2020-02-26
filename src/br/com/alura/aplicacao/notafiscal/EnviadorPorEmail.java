package br.com.alura.aplicacao.notafiscal;

public class EnviadorPorEmail implements TratadorDeNovaNotaFiscal {
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("enviando por e-mail");
    }
}
