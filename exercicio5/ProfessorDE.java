package heranca2;

public class ProfessorDE extends Pessoa {
	int matricula;
	double salario;
	
	public ProfessorDE(String nome, String endereco, int matricula, double salario) {
		super(nome, endereco);
		this.matricula = matricula;
		this.salario = salario;
	}
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Matricula: " +matricula);
		System.out.println("Salario: " +salario);
	}

}
