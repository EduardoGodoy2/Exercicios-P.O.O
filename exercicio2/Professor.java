package heranca;

public class Professor extends Pessoa{
	int horasDeAulaMes;
	int valorHora;
	int salario;
	
	public void calculaSalario() {
		int salario = horasDeAulaMes * valorHora;
		System.out.println("Salario: " + salario);
	}
	public Professor (String nome, int cpf, int telefone, int horasDeAulaMes, int valorHora) {
		super(nome, cpf, telefone);
		this.horasDeAulaMes = horasDeAulaMes;
		this.valorHora = valorHora;
	}
	public void exibirDados() {
		System.out.println("Horas de aula por mês: " + horasDeAulaMes);
		System.out.println("Valor por hora: " + valorHora);
	}
	

}
