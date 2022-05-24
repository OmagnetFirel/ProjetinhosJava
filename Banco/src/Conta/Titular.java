package Conta;

public class Titular {
	private String titular;
	private String email;
	private String cpf;
	
	public void setNome(String nome) {
		titular = nome;
	}
	
	public void setEmail(String emailTitular) {
		email = emailTitular;
	}
	
	public void setCpf(String cpfTitular) {
		cpf = cpfTitular;
	}
	
	public void getDadosTitular(){
		System.out.println("Nome: "+ titular);
		System.out.println("Email: "+ email);
		System.out.println("Cpf: "+ cpf);
	}
	
}
