package escola;

public class Funcionario {
	public int num_func;
	public String nome;
	public String endereco;
	
	public Funcionario(int num_func, String nome, String endereco) {
		this.num_func = num_func;
		this.nome = nome;
		this.endereco = endereco;
	}
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Número do Funcionário " + num_func);
	}

}
