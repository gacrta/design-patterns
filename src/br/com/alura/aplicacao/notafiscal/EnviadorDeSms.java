package br.com.alura.aplicacao.notafiscal;

public class EnviadorDeSms implements TratadorDeNovaNotaFiscal {
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("enviando por sms");
    }
}
