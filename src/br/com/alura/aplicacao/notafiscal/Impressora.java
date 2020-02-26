package br.com.alura.aplicacao.notafiscal;

public class Impressora implements TratadorDeNovaNotaFiscal {
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("imprimindo notaFiscal");
    }
}
