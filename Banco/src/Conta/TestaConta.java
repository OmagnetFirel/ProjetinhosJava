package Conta;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.setNumero(1);
		conta1.setTitularEmail("teste@teste.com");
		conta1.setTitularNome("Tete momo");
		conta1.setTitularCpf("0000000-11");
		conta1.getDadosConta();
		
		Conta conta2 = new Conta();
		conta2.setNumero(2);
		conta2.setTitularEmail("teste@test2.com");
		conta2.setTitularNome("Veeectooor");
		conta2.setTitularCpf("0000000-22");
		conta2.getDadosConta();
		
		if(conta1.deposita(200)) {
			System.out.println("Depositado " + 200 + " na conta" );
		}else {
			System.out.println("Valor para depósito não permitido!");
		}
		
		if(conta1.saque(1200)) {
			System.out.println("Saque de "+1200+"realizado com sucesso!!");
		}else {
			System.out.println("Valor para saque indisponível!");
		}
		
		
		if(conta1.transfereDinheiro(conta2, 500)) {
			System.out.println("Transferencia realizada com sucesso");
		}else {
			System.out.println("Transferencia Negada");
		}
		
		conta1.getDadosConta();
		System.out.println("------");
		conta2.getDadosConta();
	}
}
