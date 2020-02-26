package br.com.alura.aplicacao.notafiscal;

public class ItemDaNota {
	String nome;
	double valor;

	public ItemDaNota(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Item: " + this.nome + ", valor: " + this.valor;
	}
}
