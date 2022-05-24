package Conta;

public class Conta {
	private Titular titular = new Titular();
	private int numero;
	private double saldo = 500;
	
	public void setNumero(int numeroConta) {
		numero = numeroConta;
	}
	
	public void setTitularNome(String nome) {
		titular.setNome(nome);
	}
	public void setTitularCpf(String cpf) {
		titular.setCpf(cpf);
	}
	public void setTitularEmail(String email) {
		titular.setEmail(email);
	}
	
	public boolean deposita(double valor) {
		if(valor <= 0) return false;
		saldo = saldo + valor;
		return true;
	}
	
	public boolean saque(double valor) {
		if(valor <= 0) return false;
		if (valor > saldo) return false;
		saldo = saldo-valor;
		return true;
	}
	
	public boolean transfereDinheiro(Conta contaDestino, double valor) {
		if(saque(valor)) {
			contaDestino.deposita(valor);
			return true;
		}
		return false;
	}
	
	
	public void getDadosConta() {
		titular.getDadosTitular();
		System.out.println("");
		System.out.println("Numero: "+ numero);
		System.out.println("Saldo: "+ saldo);
	}
	
	

}
