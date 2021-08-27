public class ContaPoupanca extends Conta {

	// chama o construtor da classe pai do cliente
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	// apresenta mensagem e executa um método
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
