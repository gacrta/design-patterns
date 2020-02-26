package br.com.alura.aplicacao.notafiscal;

public class NotaFiscalDao implements TratadorDeNovaNotaFiscal {
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("salvando no banco");
    }
}
