package br.com.alura.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.aplicacao.descontoextra.EmAprovacao;
import br.com.alura.aplicacao.descontoextra.EstadoDeUmOrcamento;

public class Orcamento {
	public double valor;
	private final List<Item> itens;
	
	public EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor){
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		this.estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public void adicionaItem(Item item) {
		itens.add(item);
	}
	
	public boolean contemItemDeNome(String nomeDoItem) {
		for(Item i : this.itens) {
			if(i.getNome().equals(nomeDoItem))
				return true;
		}
		return false;
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
		
    public void aprova() {
      estadoAtual.aprova(this);
    }

    public void reprova() {
      estadoAtual.reprova(this);
    }

    public void finaliza() {
      estadoAtual.finaliza(this);
    }

}
