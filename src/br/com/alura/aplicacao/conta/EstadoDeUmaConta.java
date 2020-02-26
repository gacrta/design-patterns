package br.com.alura.aplicacao.conta;

public interface EstadoDeUmaConta {
	
	public boolean aceitaSaques(Conta conta);
	
	public void deposita(Conta conta, double valor);
	
	public void verificaEstado(Conta conta);

}
