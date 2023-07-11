package heranca;

public class Pessoa {
	String nome;
	int cpf;
	int telefone;
	
	public Pessoa (String nome, int cpf, int telefone) {
	this.nome = nome;
	this.cpf = cpf;
	this.telefone = telefone;
	}
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Cpf: " + cpf);
		System.out.println("Telefone " + telefone);
	}
}
