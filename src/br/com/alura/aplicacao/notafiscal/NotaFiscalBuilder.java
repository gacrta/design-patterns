package br.com.alura.aplicacao.notafiscal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
    private String razaoSocial;
    private String cnpj;
    private List<ItemDaNota> itens = new ArrayList<>();
    private double valorBruto;
    private double imposto;
    private String observacoes;
    private Calendar data;
    
    List<TratadorDeNovaNotaFiscal> acoesAExecutar = new ArrayList<>();
    
    public NotaFiscalBuilder cadastraAcao(TratadorDeNovaNotaFiscal acao) {
    	acoesAExecutar.add(acao);
    	return this;
    }

    public NotaFiscal constroi() {

    	NotaFiscal nf = new NotaFiscal(this.razaoSocial, this.cnpj, this.data, this.valorBruto, this.imposto, this.itens, this.observacoes);

        // Padrao observer
        for (TratadorDeNovaNotaFiscal acao : acoesAExecutar) {
        	acao.executa(nf);
        }

        return nf;
    }

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
    	this.razaoSocial = razaoSocial;
    	return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
    	this.cnpj = cnpj;
    	return this;
    }
    
    public NotaFiscalBuilder com(ItemDaNota item) {
    	itens.add(item);
    	valorBruto += item.getValor();
    	imposto += item.getValor() * 0.05;
    	return this;}

    public NotaFiscalBuilder comObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    public NotaFiscalBuilder naDataAtual() {
        this.data = Calendar.getInstance();
        return this;
    }
}
