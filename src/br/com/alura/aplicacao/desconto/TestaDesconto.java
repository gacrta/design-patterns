package br.com.alura.aplicacao.desconto;

import br.com.alura.aplicacao.Item;
import br.com.alura.aplicacao.Orcamento;

public class TestaDesconto {

	public static void main(String[] args) {
		Orcamento o1 = new Orcamento(200.0);
		
		Item i1 = new Item("I1", 50.0);
		Item i2 = new Item("I2", 50.0);
		Item i3 = new Item("I3", 100.0);
		
		
		o1.adicionaItem(i1);
		o1.adicionaItem(i2);
		o1.adicionaItem(i3);
		
		
		CalculadorDeDesconto cd = new CalculadorDeDesconto();
		
		// Teste sem desconto! valor = 200; numero itens = 3
		System.out.println(cd.calcula(o1));
		
		Orcamento o2 = new Orcamento(600.0);
		
		Item i4 = new Item("I4", 400.0);
		
		o2.adicionaItem(i1);
		o2.adicionaItem(i2);
		o2.adicionaItem(i3);
		o2.adicionaItem(i4);
		
		System.out.println(600.0*0.07);
		// Teste desconto mais de 500: valor = 600
		System.out.println(cd.calcula(o2));
		
		
		// Teste desconto mais de 5 itens: valor = 350.0
		Orcamento o3 = new Orcamento(350.0);
		
		i4 = new Item("I4", 50.0);
		Item i5 = new Item("I5", 50.0);
		Item i6 = new Item("I6", 50.0);
		
		o3.adicionaItem(i1);
		o3.adicionaItem(i2);
		o3.adicionaItem(i3);
		o3.adicionaItem(i4);
		o3.adicionaItem(i5);
		o3.adicionaItem(i6);
		
		System.out.println(350.0*0.1);
		System.out.println(cd.calcula(o3));
		
		// Teste Venda Casada
		Orcamento o4 = new Orcamento(100.0);
		o4.adicionaItem(new Item("CANETA", 50.0));
		o4.adicionaItem(new Item("LAPIS", 50.0));
		
		System.out.println(100.0*0.05);
		System.out.println(cd.calcula(o4));

	}

}
