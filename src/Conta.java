public abstract class Conta implements IConta {
	
	// atributos
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	// construtor
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	// método sacar
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	// método depositar
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	// método transferir
	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	// faz o get da agência
	public int getAgencia() {
		return agencia;
	}

	// faz o get do número
	public int getNumero() {
		return numero;
	}

	// faz o get do saldo
	public double getSaldo() {
		return saldo;
	}

	// mostra as informações em forma de mensagem
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
