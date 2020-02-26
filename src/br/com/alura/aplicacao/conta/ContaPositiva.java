package br.com.alura.aplicacao.conta;

public class ContaPositiva implements EstadoDeUmaConta {

	@Override
	public boolean aceitaSaques(Conta conta) {
		return true;
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.98;
	}

	public void verificaEstado(Conta conta) {
		if(conta.saldo < 0 ) conta.estadoAtual = new ContaNegativa();
	}
}
