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

    public NotaFiscal constroi() {
        return new NotaFiscal(this.razaoSocial, this.cnpj, this.data, this.valorBruto, this.imposto, this.itens, this.observacoes);

        // Padrao observer
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
