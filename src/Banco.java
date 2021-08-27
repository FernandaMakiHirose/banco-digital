import java.util.List;

public class Banco {

	// atributos
	private String nome;
	private List<Conta> contas;

	// faz o get do nome
	public String getNome() {
		return nome;
	}

	// faz o set do nome e o retorno é vazio
	public void setNome(String nome) {
		this.nome = nome;
	}

	// faz o get de uma lista de contas
	public List<Conta> getContas() {
		return contas;
	}

	// faz o set de uma lista de contas e o retorno é vazio
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
