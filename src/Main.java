public class Main {

	public static void main(String[] args) {

		// passa o nome do cliente
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		// passa o nome do cliente para a conta corrente e para a poupança
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		// passa os valores para depositar e transferir
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		// e por fim imprime o extrato da conta corrente e da poupança
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
