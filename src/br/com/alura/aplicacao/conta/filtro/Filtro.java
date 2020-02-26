package br.com.alura.aplicacao.conta.filtro;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.aplicacao.conta.Conta;

public abstract class Filtro {
	
	private Filtro outroFiltro;

	public final List<Conta> filtra(List<Conta> contas) {
		List<Conta> contasFiltradas = new ArrayList<>();
		
		for (Conta conta : contas) {
			if(!deveRecusar(conta)) {
				contasFiltradas.add(conta);
			}
		}
		return filtraPorOutroFiltro(contasFiltradas);
	}
	
	public abstract boolean deveRecusar(Conta conta);
	
	public List<Conta> filtraPorOutroFiltro(List<Conta> contas) {
		if(outroFiltro == null) return contas;
		return outroFiltro.filtra(contas);
	}
	
	public Filtro() {}
	
	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}

}
