package br.com.alura.aplicacao.conta;

public class Conta {
	protected double saldo;
	private String titular;
	private String dataDeAbertura;
	
	protected EstadoDeUmaConta estadoAtual;

	public Conta(String titular) {
		this.titular = titular;
		estadoAtual = new ContaNegativa();
		
	}
	
	public void deposita(double valor) {
		estadoAtual.deposita(this, valor);
		estadoAtual.verificaEstado(this);
	}
	
	public double saca(double valor) {
		if(estadoAtual.aceitaSaques(this)) {
			this.saldo -= valor;
			estadoAtual.verificaEstado(this);
			return valor;
		}
		throw new RuntimeException("Conta negativada nao pode sacar");
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setDataDeAbertura(String data) {
		this.dataDeAbertura = data;
	}
	
	public String getDataDeAbertura() {
		return dataDeAbertura;
	}
	
	@Override
	public String toString() {
		return "Titular: " + titular + ", saldo: " + saldo;
	}
	
}