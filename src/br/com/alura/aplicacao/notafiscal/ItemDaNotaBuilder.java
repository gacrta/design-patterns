package br.com.alura.aplicacao.notafiscal;

public class ItemDaNotaBuilder {
	private String nomeDoItem;
	private double valorDoItem;

	public ItemDaNotaBuilder comNome(String nome) {
		this.nomeDoItem = nome;
		return this;
	}

	public ItemDaNotaBuilder comValor(double valor) {
		this.valorDoItem = valor;
		return this;
	}

	public ItemDaNota build() {
		return new ItemDaNota(this.nomeDoItem, this.valorDoItem);
	}
}
