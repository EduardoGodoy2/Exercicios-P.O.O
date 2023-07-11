package heranca2;

public class ProfessorHr extends Pessoa {
	int mat;
	int qtdHoras;
	int valorHora;
	double salario;
	
	public ProfessorHr(String nome, String endereco, int mat, int qtdHoras, int valorHora) {
		super(nome, endereco);
		this.mat = mat;
		this.qtdHoras = qtdHoras;
		this.valorHora = valorHora;
	}
	
	public void CalcularSalario() {
		salario =  qtdHoras * valorHora;
	}
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Matricula: " +mat);
		System.out.println("Quantidade de Horas: "+qtdHoras);
		System.out.println("Valor da Hora:" +valorHora);
		System.out.println("Salario: " +salario);
	}
	
}
