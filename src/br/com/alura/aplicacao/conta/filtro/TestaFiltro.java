package br.com.alura.aplicacao.conta.filtro;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.aplicacao.conta.Conta;

public class TestaFiltro {

	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<>();
		
		contas.add(new Conta("1"));
		contas.add(new Conta("2"));
		contas.add(new Conta("3"));
		contas.add(new Conta("4"));
		
		contas.get(0).deposita(99);
		contas.get(1).deposita(1000);
		contas.get(2).deposita(5000);
		contas.get(3).deposita(600000);
		
		Filtro saldoMenorQue100 = new FiltroSaldoMenorQue100Reais();
		Filtro saldoMaiorQue500k = new FiltroSaldoMaiorQue500MilReais();
		
		Filtro osDoisJuntos = new FiltroSaldoMaiorQue500MilReais(saldoMenorQue100);
		
		System.out.println(saldoMenorQue100.filtra(contas));
		System.out.println(saldoMaiorQue500k.filtra(contas));
		System.out.println(osDoisJuntos.filtra(contas));

	}

}
