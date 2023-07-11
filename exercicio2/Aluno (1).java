package heranca;

public class Aluno extends Pessoa {
	int matr;
	double nota1;
	double nota2;
	
	public void calculaMedia() {
		double m =(nota1 + nota2) / 2;
		System.out.println("Média: " + m);
	}
	public Aluno (String nome, int cpf, int telefone, int matr, double nota1, double nota2) {
		super(nome, cpf, telefone);
		this.matr = matr;
		this.nota1 = nota1;
		this.nota2 = nota2;
		
	}
	public void exibirDados() {
		System.out.println("Matricula: " + matr);
		System.out.println("Nota1: " + nota1);
		System.out.println("Nota2: " + nota2);
	}

}
